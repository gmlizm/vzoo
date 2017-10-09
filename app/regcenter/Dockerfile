FROM java:latest
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>

ADD ./vzoo-regcenter-1.0.0.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/vzoo-regcenter-1.0.0.jar"]

EXPOSE 9999