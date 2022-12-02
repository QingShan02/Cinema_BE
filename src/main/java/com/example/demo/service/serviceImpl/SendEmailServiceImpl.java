package com.example.demo.service.serviceImpl;

import com.example.demo.mapper.SendEmailMapper;
import com.example.demo.model.SendEmail;
import com.example.demo.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

@Service
public class SendEmailServiceImpl implements SendEmailService {
    @Autowired
    SendEmailMapper mapper;
    @Override
    public List<SendEmail> getAll() {
        return mapper.getAll();
    }

}
