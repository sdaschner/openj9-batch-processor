cd ../../

docker build -f demos/baseline-openj9-vs-hotspot/Dockerfile_hotspot -t oj9d_hotspot_baseline . &

docker build -f demos/baseline-openj9-vs-hotspot/Dockerfile_openj9 -t oj9d_openj9_baseline . 

exit 0
