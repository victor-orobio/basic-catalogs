FROM adoptopenjdk/openjdk11
EXPOSE 8084
ARG JAR_FILE=target/*SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]