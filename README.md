# Jrebel & Jet Brains License Server for Java

A license server for Jrebel & JetBrains products, it also support JRebel for Android and XRebel.

Forked from [JrebelLicenseServer](https://github.com/SpectatorWjx/JrebelLicenseServer)

***
Thank ilanyu

This repository only provide complied jar file.

NOTE: This is provided for educational purposes only. Please support genuine.

***

## Setup
Run:
```
cd /path/to/project
mvn compile 
mvn exec:java -Dexec.mainClass="com.delpast.server.MainServer" -Dexec.args="-p 8081"
```
Packing a runnable jar:
```
mvn package
```
then
```
java -jar JrebelBrainsLicenseServerforJava-1.0-SNAPSHOT.jar -p 8081
```
default port is 8081.

Or use gradle
```
gradle shadowJar

java -jar JrebelBrainsLicenseServerforJava-1.0-SNAPSHOT.jar -p 8081
```
## Docker
Build image
```
mvn package 
docker build -t jrebel-ls .
```

start container
```
docker run -d --name jrebel-ls --restart always -e PORT=9001 -p 9001:9001 jrebel-ls
```
default port is 1314,you can modify it
## Support

Jrebel

JRebel for Android

XRebel

JetBrains Products

## Feedback

+ issue: https://gitee.com/gsls200808/JrebelLicenseServerforJava/issues
