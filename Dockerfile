FROM openjdk:17
RUN mkdir /app
COPY ./build/libs/*-all.jar /com.ncgroup.formula1-api-all.jar
ENTRYPOINT ["java","-jar","/com.ncgroup.formula1-api.jar"]