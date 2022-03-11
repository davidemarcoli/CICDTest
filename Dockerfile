FROM gradle:7.1-jdk16 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle --no-daemon bootJar

FROM openjdk:16-alpine
EXPOSE 8080
COPY --from=build /home/gradle/src/build/libs/*.jar application.jar
ENTRYPOINT ["java", "-jar", "-Xmx4g", "application.jar"]