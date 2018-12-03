FROM azul/zulu-openjdk:11
VOLUME /tmp

COPY containers-0.0.1-SNAPSHOT.jar /tmp/app.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/tmp/app.jar"]
