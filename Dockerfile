FROM ubuntu:latest

RUN apt update

RUN apt install openjdk-11-jdk -y

WORKDIR /usr/app/src

COPY cal.java ./

