#docker run --network=host -p 38400:38400 --network=host --name openj9_jitaas_server  oj9d_jitaas_server:latest &
#docker run --network=host --name openj9_jitaas_server oj9d_jitaas_server:latest &

#docker run --network=host raguks/ragustry:jitasv2 /jdk/bin/java -XX:JITaaSServer -Xjit:verbose &
#sleep 2

#docker run --name openj9_jitaas_client_1 oj9d_jitaas_client:latest &
#docker run --name openj9_jitaas_client_2 oj9d_jitaas_client:latest &

docker run --name openj9_jitaas_client_1 -v $(pwd)/batch-processor-0.0.1-SNAPSHOT.jar:/batch-processor-0.0.1-SNAPSHOT.jar raguks/ragustry:jitasv2 /jdk/bin/java -jar -XX:JITaaSClient:server=192.168.1.63 batch-processor-0.0.1-SNAPSHOT.jar --run-type=medium &
docker run --name openj9_jitaas_client_2 -v $(pwd)/batch-processor-0.0.1-SNAPSHOT.jar:/batch-processor-0.0.1-SNAPSHOT.jar raguks/ragustry:jitasv2 /jdk/bin/java -jar -XX:JITaaSClient:server=192.168.1.63 batch-processor-0.0.1-SNAPSHOT.jar --run-type=medium &
