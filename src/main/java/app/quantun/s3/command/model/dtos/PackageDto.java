package app.quantun.s3.command.model.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * Represents a Data Transfer Object for a package.
 *
 * @param id            Identifier of the package, must be between 1 and 255 characters
 * @param name          Name of the package file, must be between 1 and 255 characters
 * @param base64Content Base64 encoded content of the package file
 * @param isZipPackage  Flag indicating if the package is a Zip file
 * @param unzipPackage  Flag indicating if the package should be unzipped
 * @param folderId      Identifier of the folder where the package is stored
 * @param s3Id          Identifier for the package in the S3 storage
 */
public record PackageDto(

        @Size(min = 1, max = 255, message = "ID must be between 1 and 255 characters")
        String id,

        @NotBlank(message = "File name is mandatory")
        @Size(min = 1, max = 255, message = "File name must be between 1 and 255 characters")
        String name,


        @NotBlank(message = "Package content is mandatory")
        String base64Content,

        boolean isZipPackage,

        boolean unzipPackage,

        String folderId,


        String s3Id) {
}
