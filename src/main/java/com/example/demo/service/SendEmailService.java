package com.example.demo.service;

import com.example.demo.model.SendEmail;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import java.io.IOException;
import java.util.List;

public interface SendEmailService {
    List<SendEmail> getAll();
}
