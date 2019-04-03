FROM openjdk:11-jdk-slim

MAINTAINER Ravi Sankar Karuturi(github/karuturirs)

RUN apt-get update && \
    apt-get upgrade -y

# Set the working directory to /app
WORKDIR /app

COPY ./service/target/mocktail-bird-service-*.jar  /app/

CMD java -jar /app/mocktail-bird-service-*.jar

EXPOSE 9080
