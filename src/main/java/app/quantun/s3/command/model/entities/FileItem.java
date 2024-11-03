package app.quantun.s3.command.model.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("FileItem")
public class FileItem {

    @Id
    private String id;           // Unique identifier for the file
    private String fileName;

    private Long fileSize;       // Size in bytes

    @Indexed
    private String folderId;     // Reference to Folder ID


    private String s3Id;
}
