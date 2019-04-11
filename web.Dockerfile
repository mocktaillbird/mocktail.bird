FROM maven:3.6.0-jdk-11-slim

MAINTAINER Ravi Sankar Karuturi(github/karuturirs)

RUN apt-get update && \
    apt-get upgrade -y && \
    apt-get install -y git

# Set the working directory to /app
WORKDIR /app

COPY .  /app/mocktail.bird/

CMD cd /app/mocktail.bird ; mvn clean install ; cd web ; mvn spring-boot:run

EXPOSE 8080
