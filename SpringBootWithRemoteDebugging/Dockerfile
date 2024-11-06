FROM openjdk:17
ADD target/SpringBootWithRemoteDebugging-0.0.1-SNAPSHOT.jar SpringBootWithRemoteDebugging-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","-agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=*:5005", "SpringBootWithRemoteDebugging-0.0.1-SNAPSHOT.jar"]