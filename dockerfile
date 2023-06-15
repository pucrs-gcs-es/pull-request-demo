FROM openjdk:17
WORKDIR /app
EXPOSE 443:443
EXPOSE 444:444
COPY ./microservico1/target/microservico1-1.0.jar .
COPY ./microservico1/keystore.p12 .
COPY ./microservico2/target/microservico2-1.0.jar .
COPY ./launcher.sh .
CMD  chmod . 777; /bin/bash -c './launcher.sh'
