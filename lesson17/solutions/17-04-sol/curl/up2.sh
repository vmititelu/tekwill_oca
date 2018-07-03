#!/bin/bash
echo Executing: curl -X PUT -H "Content-Type: application/json" -d http://localhost:8080/players/2
curl -X PUT -i -H "Content-Type: application/json" -d '{"id":2,"team":"Pelicans","name":"Jim Bob Joyce","position":"M","number":"7","country":"Ireland","goals":10,"yellowCards":2}' http://localhost:8080/players/2
