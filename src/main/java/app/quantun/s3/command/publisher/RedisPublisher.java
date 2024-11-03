package app.quantun.s3.command.publisher;


import app.quantun.s3.common.anotations.Publisher;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;

@Publisher
@Slf4j
@RequiredArgsConstructor
public class RedisPublisher {

    private final @NotNull RedisTemplate<String, Object> redisTemplate;
    private final @NotNull ChannelTopic topic;


    public void publish(@NotNull String message) {
        redisTemplate.convertAndSend(topic.getTopic(), message);
        log.info("Published message: {}", message);

    }
}
