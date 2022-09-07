FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD web-app.jar /app/web-app.jar
#相当于在容器中用cmd命令执行jar包  指定外部配置文件
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/web-app.jar"]