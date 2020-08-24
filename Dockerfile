FROM maven:3-adoptopenjdk-14
RUN apt-get install -y tzdata
ENV TZ=Asia/Tokyo

COPY . /predownload
WORKDIR /predownload
RUN mvn package
WORKDIR /
