#!/bin/bash
cd ${0%/*}


docker build -f Dockerfile_openj9_quickstart_short_run_cold -t oj9d_openj9_quickstart_short_run_cold .
docker build -f Dockerfile_openj9_quickstart_short_run_copied_cache -t oj9d_openj9_quickstart_short_run_copied_cache .
docker build -f Dockerfile_openj9_quickstart_short_run_shared_cache -t oj9d_openj9_quickstart_short_run_shared_cache .
docker build -f Dockerfile_openj9_quickstart_short_run_warm -t oj9d_openj9_quickstart_short_run_warm .
