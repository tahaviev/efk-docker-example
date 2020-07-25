FROM maven:3.6.3-openjdk-11
WORKDIR app
COPY src src
COPY pom.xml pom.xml
RUN mvn package
CMD java -jar target/app.jar
