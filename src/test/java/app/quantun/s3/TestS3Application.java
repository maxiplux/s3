package app.quantun.s3;

import org.springframework.boot.SpringApplication;

public class TestS3Application {

    public static void main(String[] args) {
        SpringApplication.from(S3Application::main).with(TestcontainersConfiguration.class).run(args);
    }

}
