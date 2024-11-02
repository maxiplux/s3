package app.quantun.s3.models.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record FileItemDTO(

        @Size(min = 1, max = 255, message = "ID must be between 1 and 255 characters")
        String id,

        @NotBlank(message = "File name is mandatory")
        @Size(min = 1, max = 255, message = "File name must be between 1 and 255 characters")
        String fileName,



        String base64Content,
        String folderId,


        String s3Id) {
}
