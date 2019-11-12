FROM openjdk:8u171-jdk-alpine3.8
LABEL maintainer = "ruibatistasilvajunior@gmail.com"

ENV LANG C.UTF-8

RUN apk add --update bash

ADD build/libs/*.jar /app/app.jar
ADD SLC001.xml /app/SLC001.xml

CMD java -jar /app/app.jar