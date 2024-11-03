package app.quantun.s3.command.model.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;

public record FolderDto(
        @NotBlank(message = "ID is mandatory")
        @Size(min = 1, max = 255, message = "ID must be between 1 and 255 characters")
        String id,

        @NotBlank(message = "Folder name is mandatory")
        @Size(min = 3, max = 255, message = "Folder name must be between 1 and 255 characters")
        String folderName,


        String folderPath,

        @NotBlank(message = "Owner is mandatory")
        String owner,


        String group,


        List<PackageDto> fileItem, String s3Id) {
}
