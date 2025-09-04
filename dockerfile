FROM openjdk:17
WORKDIR /myjava
COPY ./primenumber.java .
RUN javac primenumber.java
CMD ["javac", "primenumber"]