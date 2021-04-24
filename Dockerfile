FROM maven:3-openjdk-15-slim
RUN apt-get install -y tzdata
ENV TZ=Asia/Tokyo

COPY . /predownload
WORKDIR /predownload
RUN mvn package
WORKDIR /
