package app.quantun.s3.query.subscriber;


import app.quantun.s3.common.anotations.Subcriber;
import lombok.extern.slf4j.Slf4j;


@Subcriber
@Slf4j
public class RedisSubscriber {

    public void onMessage(String message) {
        log.info("Received message: {}", message);


        // Add your business logic here
    }
}
