# Jrebel & Jet Brains License Server for Java

A license server for Jrebel & JetBrains products, it also support JRebel for Android and XRebel.

Forked from [JrebelLicenseServerforJava](https://gitee.com/gsls200808/JrebelLicenseServerforJava)

***
Thank ilanyu

This repository only provides complied jar file.

Download latest [Releases](https://github.com/HuaJI66/JrebelLicenseServer/releases)

NOTE: This is provided for educational purposes only. Please support genuine.

***

## Setup

Run:

```
cd /path/to/project
mvn compile 
mvn exec:java -Dexec.mainClass="com.delpast.server.MainServer" -Dexec.args="-p 1314"
```

Packing a runnable jar:

```
mvn package
```

then

```
java -jar JrebelBrainsLicenseServerforJava-1.0.jar -p 1314
```

default port is 1314.

Or use gradle

```
gradle shadowJar

java -jar JrebelBrainsLicenseServerforJava-1.0.jar -p 1314
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

+ [issue](https://github.com/HuaJI66/JrebelLicenseServer/issues)
