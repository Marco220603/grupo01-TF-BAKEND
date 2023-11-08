FROM ibm-semeru-runtimes:open-11-jre-focal
EXPOSE 8080
ADD ./target/*.war ./app.war
CMD java -Djava.security.egd=file:/dev/./urandom -war demo1_202302_sx61-0.0.1-SNAPSHOT.war