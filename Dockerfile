FROM anapsix/alpine-java:8_server-jre_unlimited

ENV PORT 8081

ADD target/JrebelLicenseServer-1.0.jar /JrebelBrains.jar
CMD java -jar /JrebelBrains.jar -p $PORT

