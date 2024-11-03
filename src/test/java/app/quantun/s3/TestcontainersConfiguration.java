package app.quantun.s3;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration(proxyBeanMethods = false)
public class TestcontainersConfiguration {

    @Bean
    @ServiceConnection(name = "redis")
    GenericContainer<?> redisContainer() {
        return new GenericContainer<>(DockerImageName.parse("redis:latest")).withExposedPorts(6379);
    }

    @Bean
    @ServiceConnection(name = "s3")
    GenericContainer<?> s3Container() {
        return new GenericContainer<>(DockerImageName.parse("quay.io/minio/minio"))
                .withEnv("MINIO_ROOT_USER", "ROOTNAME")
                .withEnv("MINIO_ROOT_PASSWORD", "CHANGEME123")
                .withExposedPorts(9000, 9001);
    }


}
