FROM openjdk:17-jdk-alpine3.14
RUN mkdir /app
COPY ./build/libs/com.ncgroup.formula1-api-all.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]