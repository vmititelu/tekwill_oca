#!/bin/bash
echo Executing: curl -X GET http://localhost:8080/players/country/France
curl -X GET -i http://localhost:8080/players/country/France
