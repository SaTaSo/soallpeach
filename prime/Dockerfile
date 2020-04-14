FROM openjdk:8-jdk-alpine

WORKDIR /app

copy primeNumber.jar .
copy file.txt .

ENTRYPOINT ["java","-jar","primeNumber.jar"]