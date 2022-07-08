FROM openjdk:11-jre-slim
EXPOSE 8091
COPY  /build/libs/*.jar ./app.jar
CMD ["java","-jar","app.jar"]