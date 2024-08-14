FROM openjdk:17
EXPOSE 8080
ADD target/springboot-elk-kubernate.war springboot-elk-kubernate.war
ENTRYPOINT ["java","-war","/springboot-elk-kubernate.war"]