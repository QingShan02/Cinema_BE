package com.example.demo;

import com.example.demo.model.SendEmail;
import com.example.demo.service.FilesStorageService;
import com.example.demo.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

@SpringBootApplication
public class RapChieuPhimWebApplication implements CommandLineRunner {
    @Resource
    FilesStorageService storageService;
    @Autowired
    SendEmailService service;

    public static void main(String[] args) {
        SpringApplication.run(RapChieuPhimWebApplication.class, args);

    }

    SendEmail s;

    @Override
    public void run(String... arg) throws Exception {
//    storageService.deleteAll();
        storageService.init();
//        List<SendEmail> list = service.getAll();
//        list.stream().forEach(s->{
//            Thread t = new Thread(new ThreadServiceEmail(s, "00:59:00"));
//            t.start();
//        });

    }

}
