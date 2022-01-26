FROM openjdk:8-jdk-alpine
MAINTAINER pedroluiznogueira
COPY target/java-docker-ci-0.0.1-SNAPSHOT.jar java-docker-ci-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/java-docker-ci-0.0.1-SNAPSHOT.jar"]