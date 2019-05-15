#docker run --name openj9_jitaas_client_1 oj9d_jitaas_client:latest &
docker run --name openj9_jitaas_client -v $(pwd)/batch-processor-0.0.1-SNAPSHOT.jar:/batch-processor-0.0.1-SNAPSHOT.jar raguks/ragustry:jitasv2 /jdk/bin/java -jar -XX:JITaaSClient:server=192.168.1.63 batch-processor-0.0.1-SNAPSHOT.jar --run-type=medium &

docker run --name openj9_tuned --mount source=java-shared-classes,target=/cache oj9d_openj9_tuned_medium_run:latest &
