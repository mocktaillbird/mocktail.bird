FROM mongo:3.6.11-stretch

MAINTAINER Ravi Sankar Karuturi(github/karuturirs)

COPY ./scripts/mongo-init.js /docker-entrypoint-initdb.d/mongo-init.js

EXPOSE 27017
