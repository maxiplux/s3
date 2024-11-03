package app.quantun.s3.services;


import app.quantun.s3.command.model.dtos.AsyncApiResponse;
import app.quantun.s3.command.model.dtos.FolderDto;
import app.quantun.s3.command.model.dtos.PackageDto;
import jakarta.validation.Valid;

public interface FolderService {

    AsyncApiResponse createFolder(@Valid FolderDto folderDto);

    AsyncApiResponse uploadPackage(String folderId, @Valid PackageDto packageDTO);
}
