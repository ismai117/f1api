FROM openjdk:17.0.8.1
RUN mkdir /app
COPY ./build/libs/*-all.jar /app/formula1-api.jar
ENTRYPOINT ["java","-jar","/app/formula1-api.jar"]