# ecommerse

The eCommerse Management API performs a compound domain model progress to order a stuff from different comanies.

Technologies
Spring Boot
Aspect
Kafka
Maven
Javax
Lombok
Swagger
Docker (Dockerfile, docker-compose.yml)

How to run project
Clone project to local machine
Change docker file up to your needs.
Build jar file (Maven clean install)
Come to app root folder, open cmd then run "docker-compose up"

As Kafka topics are not created automatically by default, this application requires that you create the following topics manually.

$ bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic baeldung
$ bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 5 --topic partitioned
$ bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic filtered
$ bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic greeting

Application starts on localhost port 8080

http://localhost:8080/ecommerse/api/swagger-ui.html#/

Author
Mervedkr
