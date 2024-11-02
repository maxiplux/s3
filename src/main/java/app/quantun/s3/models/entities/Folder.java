package app.quantun.s3.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Folder")
public class Folder {

    @Id
    private String id; // Use folder path or unique ID

    private String folderName;
    private String folderPath;
    private String ownerId;    // User ID or name of the owner
    private String groupOwnerId;  // Group ID or name of the group owner

    // Constructors, Getters, and Setters
}
