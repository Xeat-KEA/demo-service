# 1. OpenJDK 17을 기반으로 이미지를 생성
FROM openjdk:17-jdk-slim

# 2. 애플리케이션 JAR 파일을 /app 폴더에 복사
COPY build/libs/helloworld-0.0.1-SNAPSHOT.jar /app/hello-app.jar

# 3. 컨테이너가 실행될 때 실행할 명령어
ENTRYPOINT ["java", "-jar", "/app/hello-app.jar"]
