package com.example.demo.ResController;

import ch.qos.logback.core.rolling.helper.FileNamePattern;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/api/image")
public class ApiImage {
//    private static String imageDirectory = System.getProperty("user.dỉr") +"/Image/poster/";
//    @GetMapping("/update")
//    public ResponseEntity<Integer>  UpdateImage(@RequestParam("imageFile")MultipartFile file, @RequestParam("imageName") String name) {
//        makeDirectoryIfNotExist(imageDirectory);
//    }
//    private void makeDirectoryIfNotExist(String imageDirectory){
//        File directory = new File(imageDirectory);
//        if(!directory.exists()){
//            directory.mkdir();
//        }
//    }
}
