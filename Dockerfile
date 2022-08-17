FROM openjdk:17
EXPOSE 8080
COPY target/springboot-images-new.jar springboot-images-new
ENTRYPOINT["java", "-jar", "/springboot-images-new.jar"]