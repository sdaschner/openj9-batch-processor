while true; do docker stats --no-stream --format "{{.Name}}, {{.CPUPerc}}, {{.MemUsage}}" >> stats.txt; echo >> stats.txt; done
