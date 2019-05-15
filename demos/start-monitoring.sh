#!/bin/bash
cd ${0%/*}

docker stop cadvisor prometheus grafana node-exporter &> /dev/null | true

rm -Rf /tmp/{prometheus_data,grafana_data}
mkdir -m 777 /tmp/{prometheus_data,grafana_data}

echo starting cadvisor...

docker run -d --rm \
  --name cadvisor \
  --network dkrnet \
  -v /:/rootfs:ro \
  -v /var/run:/var/run:rw \
  -v /sys:/sys:ro \
  -v /var/lib/docker/:/var/lib/docker:ro \
  -p 8080:8080 \
  google/cadvisor

sleep 3


echo starting prometheus

docker run -d --rm \
  --name prometheus \
  --network dkrnet \
  -v $(pwd)/../prometheus/prometheus/:/etc/prometheus/ \
  -v /tmp/prometheus_data:/prometheus \
  -p 9090:9090 \
  prom/prometheus  '--config.file=/etc/prometheus/prometheus.yml' '--storage.tsdb.path=/prometheus'  '--web.console.libraries=/usr/share/prometheus/console_libraries' '--web.console.templates=/usr/share/prometheus/consoles'

sleep 2


echo starting node-exporter

docker run -d --rm \
  --name node-exporter \
  --network dkrnet \
  -v /proc:/host/proc:ro \
  -v /sys:/host/sys:ro \
  -v /:/rootfs:ro \
  -p 9100:9100 \
  prom/node-exporter '--path.procfs=/host/proc' '--path.sysfs=/host/sys' '--collector.filesystem.ignored-mount-points' "^/(sys|proc|dev|host|etc|rootfs/var/lib/docker/containers|rootfs/var/lib/docker/overlay2|rootfs/run/docker/netns|rootfs/var/lib/docker/aufs)($$|/)"

sleep 2


echo starting grafana

docker run -d --rm \
  --name grafana \
  --network dkrnet \
  -v /tmp/grafana_data:/var/lib/grafana \
  -v $(pwd)/../prometheus/grafana/provisioning/:/etc/grafana/provisioning/ \
  --env-file $(pwd)/../prometheus/grafana/config.monitoring \
  -p 3000:3000 \
  grafana/grafana
