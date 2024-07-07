FROM openjdk:17-jdk-alpine
VOLUME /tmp
EXPOSE 8080
COPY target/*.jar aerofit.jar
ENTRYPOINT ["java", "-jar", "aerofit.jar" ]