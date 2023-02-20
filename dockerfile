FROM openjdk:11
COPY target/phonebook-0.0.1-SNAPSHOT.jar phonebook.jar
ENTRYPOINT ["java","-jar","target/phonebook-0.0.1-SNAPSHOT.jar"]