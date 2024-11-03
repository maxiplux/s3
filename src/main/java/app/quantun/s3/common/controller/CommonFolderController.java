package app.quantun.s3.common.controller;


import app.quantun.s3.command.model.dtos.AsyncApiResponse;
import app.quantun.s3.command.model.dtos.FolderDto;
import app.quantun.s3.command.model.dtos.PackageDto;
import app.quantun.s3.common.anotations.ApiCommon;
import app.quantun.s3.services.FolderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ApiCommon("/api/v1/folders")
public abstract class CommonFolderController {
}
