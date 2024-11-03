package app.quantun.s3.command.model.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Group")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Group {

    @Id
    private String id;
    private String groupName;
    private User owner;

    // Constructors, Getters, and Setters
}
