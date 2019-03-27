FROM maven:3.6.0-jdk-11-slim

MAINTAINER Ravi Sankar Karuturi(github/karuturirs)

RUN apt-get update && \
    apt-get upgrade -y && \
    apt-get install -y git

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY mocktail.bird /app/mocktail.bird/
CMD cd /app/mocktail.bird/ ; mvn clean install ; cd service ; java -jar target/mocktail-bird-service-0.0.1-SNAPSHOT.jar

EXPOSE 9080