#!/bin/bash
echo Executing: curl -X DELETE http://localhost:8080/players/4
curl -X DELETE -i http://localhost:8080/players/4
