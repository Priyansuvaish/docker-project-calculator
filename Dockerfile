FROM ubuntu:latest

RUN apt update

RUN apt install openjdk-11-jdk -y

WORKDIR /usr/app/src

COPY calculator.java ./

CMD sed -i 's/\r$//' cal.java

