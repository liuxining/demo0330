FROM centos-jdk:v1

EXPOSE 8080

ADD target/demo0330-0.0.1-SNAPSHOT.jar /app.jar

ENTRYPOINT ["nohup","java","-jar","/app.jar",">","/my.out","2>&1","&"]

