package app.quantun.s3.command.model.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.util.List;

@RedisHash("Folder")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Folder {

    @Id
    private String id; // Use folder path or unique ID

    private String folderName;
    private String folderPath;
    private User user;    // User ID or name of the owner
    private Long size;
    private Group group;  // Group ID or name of the group owner

    @Indexed
    private List<String> fileItemIds;  // List of associated FileItem IDs

    // Constructors, Getters, and Setters
}
