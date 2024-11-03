package app.quantun.s3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableRedisRepositories
public class S3Application {

    public static void main(String[] args) {
        SpringApplication.run(S3Application.class, args);
    }

}
