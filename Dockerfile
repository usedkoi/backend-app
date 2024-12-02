FROM amazoncorretto:17

CMD ["./mvnw", "clean", "package"]

ARG JAR_FILE=build/libs/*SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8080

EXPOSE 5432

ENTRYPOINT ["java", "-jar", "app.jar"]