FROM openjdk:17
WORKDIR /app
COPY target/RedisCaching.jar /app/
EXPOSE 8082
CMD ["java","-jar","/app/RedisCaching.jar"]