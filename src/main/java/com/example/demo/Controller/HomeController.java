package com.example.demo.Controller;

import com.example.demo.service.SendEmailService;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Controller
@RequestMapping("/main")
public class HomeController {

    @GetMapping("/home")
    public String Home() {
        return "index";
    }
//    @GetMapping("/send")
//    public String send() throws MessagingException, IOException {
//        sendmail();
//        return "Hello world";
//    }

}
