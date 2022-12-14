package com.example.demo.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface FilesStorageService {
    public void init();

    public void save(MultipartFile file);
    public void saveQRCode(MultipartFile file);
    public Resource load(String filename);

    public void deleteAll();
    public void saveHinhPhim(MultipartFile file);
    public Stream<Path> loadAll();
}
