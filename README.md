# maven-docker-asia-tokyo
A maven docker image with timezone set to Asia/Tokyo(used for gitlab CI/CD)



## Usage

The same as maven official image:

<https://hub.docker.com/_/maven>


```bash
$ docker pull thunderz99/maven-tokyo
```

docker hub:
<https://hub.docker.com/repository/docker/thunderz99/maven-tokyo>

## properties

* maven 3
* adoptopenjdk 14
* LinuxKit based(using apt-get)
* timezone: Asia/Tokyo


## How to build this image

update the pom.xml

```bash
$ docker-compose build

$ docker-compose push
```
