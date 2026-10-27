FROM tomcat:10.1-jdk21-temurin
RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/hello-devops.war /usr/local/tomcat/webapps/hello-devops.war
EXPOSE 8080
CMD ["catalina.sh", "run"]
