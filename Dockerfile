FROM openjdk:17
RUN mkdir /app
COPY ./build/libs/*-all.jar /app/com.ncgroup.formula1-api.jar
ENTRYPOINT ["java","-jar","/app/com.ncgroup.formula1-api.jar"]