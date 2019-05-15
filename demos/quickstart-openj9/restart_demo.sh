docker restart $(docker ps -a -q -f name=openj9_quickstart) $(docker ps -a -q -f name=openj9_tuned) $(docker ps -a -q -f name=hotspot_baseline)
