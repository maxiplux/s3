package app.quantun.s3.services.impl;


import app.quantun.s3.command.model.dtos.AsyncApiResponse;
import app.quantun.s3.command.model.dtos.FolderDto;
import app.quantun.s3.command.model.dtos.PackageDto;
import app.quantun.s3.common.enums.AsyncStatus;
import app.quantun.s3.services.FolderService;
import org.springframework.stereotype.Service;

@Service
public class FolderServiceImpl implements FolderService {
    @Override
    public AsyncApiResponse createFolder(FolderDto folderDto) {
        return new AsyncApiResponse(
                "Your file has been received and is being processed asynchronously.",
                AsyncStatus.PENDING,
                "You will be notified once the processing is complete."
        );
    }

    @Override
    public AsyncApiResponse uploadPackage(String folderId, PackageDto packageDTO) {
        return new AsyncApiResponse(
                "Your file has been received and is being processed asynchronously.",
                AsyncStatus.PENDING,
                "You will be notified once the processing is complete."
        );
    }
}
