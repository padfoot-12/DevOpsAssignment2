FROM openjdk:8
COPY . /var/www/java
WORKDIR /var/www/java
RUN javac Java-App.java
CMD ["java","Name"]