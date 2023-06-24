FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/incode-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8585

CMD ["java", "-jar", "-Dserver.port=8585", "-Dspring.data.mongodb.uri=mongodb://mongodb:27017/obmin", "app.jar"]

