# S3 Spring Boot Project

This project is a Spring Boot application that integrates with Amazon S3 for file storage and management. It provides functionalities to create folders, upload files, download files, list files, and delete files in an S3 bucket.

## Technologies Used

- Java
- Spring Boot
- AWS SDK for Java v2
- Gradle

## Project Structure

- `java/app/quantun/s3/command/model/dto/FolderDto.java`: Defines the `FolderDto` record used for folder data transfer.
- `resources/application.properties`: Contains the application configuration properties, including AWS S3 and Redis settings.
- `java/app/quantun/s3/config/aws/S3Config.java`: Configures the S3 client bean with AWS credentials and endpoint.
- `java/app/quantun/s3/common/utils/S3ServiceImpl.java`: Implements the `S3Service` interface, providing methods to interact with S3.

## Configuration

The application properties are defined in `resources/application.properties`:

```ini
spring.application.name=s3
spring.data.redis.host=localhost
spring.data.redis.port=6379
spring.data.redis.database=0
spring.data.redis.timeout=60000
spring.cache.type=redis
spring.cache.redis.time-to-live=600000
aws.s3.access-key=MHj2HImn7XcGr2mhYQZf
aws.s3.secret-key=X9r6EvgWoguJazhG9rZAkyqAXGMuZ4Jxgo8jHZx7
aws.s3.bucketName=bucket-spring-boot-3
aws.s3.region=us-east-1
aws.s3.endpoint=http://localhost:9001
spring.main.allow-circular-references=true
