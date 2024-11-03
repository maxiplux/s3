package app.quantun.s3.query.controller;


import app.quantun.s3.common.anotations.Api;
import app.quantun.s3.common.controller.CommonFolderController;
import app.quantun.s3.services.FolderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Api
@RequiredArgsConstructor
@Slf4j
class FolderQueryController implements CommonFolderController {

    private final  FolderService folderService;


    @GetMapping("/")
    public @NotNull List<String> getFolders(
            @RequestParam(value = "path", defaultValue = "/") @NotNull String path,
            @RequestParam(value = "filter", required = false) @Nullable String filter) {

        File directory = new File(path);

        if (!directory.isDirectory()) {
            throw new IllegalArgumentException("Invalid directory path: " + path);
        }

        return Arrays.stream(directory.listFiles((dir, name) -> {
                    if (filter != null && !filter.isEmpty()) {
                        return name.contains(filter);
                    }
                    return true;
                }))
                .filter(File::isDirectory)
                .map(File::getName)
                .collect(Collectors.toList());
    }
}
