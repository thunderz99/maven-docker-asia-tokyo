# maven-docker-asia-tokyo
A maven docker image with timezone set to Asia/Tokyo(used for gitlab CI/CD)


## Usage

The same as maven official image:

<https://hub.docker.com/_/maven>


```bash

# Timezone set to Asia/Tokyo
$ docker pull thunderz99/maven-tokyo

# Besides, predownloaded common used jars. E.g. slf4j, apache commons, jackson, etc.
$ docker pull thunderz99/maven-tokyo:jar-predownload-openjdk15

```

docker hub:
<https://hub.docker.com/repository/docker/thunderz99/maven-tokyo>

## properties

* maven 3
* adoptopenjdk 15
* LinuxKit based(using apt-get)
* timezone: Asia/Tokyo

## How to build this image

update the pom.xml

```bash
$ docker-compose build

$ docker-compose push
```

* Common jars predownloaded(using specific tag)
