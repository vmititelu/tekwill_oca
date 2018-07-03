#!/bin/bash
echo Executing: curl -X POST -H "Content-Type: application/json" -d http://localhost:8080/players
curl -X POST -i -H "Content-Type: application/json" -d '{"id":10,"team":"Hawks","name":"Victor Hugo","position":"D","number":"8","country":"France","goals":10,"yellowCards":2}' http://localhost:8080/players
