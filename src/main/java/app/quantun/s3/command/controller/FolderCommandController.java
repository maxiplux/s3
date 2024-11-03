package app.quantun.s3.command.controller;


import app.quantun.s3.command.model.dtos.AsyncApiResponse;
import app.quantun.s3.command.model.dtos.FolderDto;
import app.quantun.s3.command.model.dtos.PackageDto;
import app.quantun.s3.common.controller.CommonFolderController;
import app.quantun.s3.services.FolderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequiredArgsConstructor
@Slf4j
class FolderController extends CommonFolderController {

    private final @NotNull FolderService folderService;


    @PostMapping("/")

    public @NotNull ResponseEntity<?> createFolder(@Valid @RequestBody FolderDto folderDto) {
        log.info("Request to create folder: {}", folderDto);
        AsyncApiResponse asyncApiResponse = folderService.createFolder(folderDto);
        log.info("Folder created successfully: {}", asyncApiResponse);
        return ResponseEntity.ok(asyncApiResponse);
    }

    @PostMapping("/{folderId}")
    public @NotNull ResponseEntity<?> uploadPackage(@PathVariable String folderId, @Valid @RequestBody PackageDto packageDTO) {
        log.info("Request to upload package to folderId {}: {}", folderId, packageDTO);
        AsyncApiResponse asyncApiResponse = folderService.uploadPackage(folderId, packageDTO);
        log.info("Package uploaded successfully to folderId {}: {}", folderId, asyncApiResponse);
        return ResponseEntity.ok(asyncApiResponse);
    }
}
