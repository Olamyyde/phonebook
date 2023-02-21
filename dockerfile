FROM openjdk:11
ARG JAR_FILE=target/phonebook-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} phonebook.jar
ENTRYPOINT ["java","-jar","phonebook.jar"]
