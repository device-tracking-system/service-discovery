FROM openjdk:8-jre-slim
LABEL name="service-discovery" \
      author="bgrochal" \
      organization="device-tracking-system"

ADD target/service-discovery-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=production", "--spring.config.location=classpath:pl/edu/agh/iet/dts/discovery/"]
