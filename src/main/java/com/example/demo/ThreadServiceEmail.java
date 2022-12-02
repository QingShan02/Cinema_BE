package com.example.demo;

import com.example.demo.model.SendEmail;
import com.example.demo.service.SendEmailService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class ThreadServiceEmail extends Thread {
    SendEmail s;
    String gio;
    public ThreadServiceEmail(){

    }
    public ThreadServiceEmail(SendEmail s, String gio){
        this.s = s;
        this.gio = gio;
    }
    public void sendmail() throws AddressException, MessagingException, IOException {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("ngobakha2t4@gmail.com", "tsopgjhvyuygyygt");
            }
        });
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("khaiminh0401@gmail.com", false));

        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(s.getEmail()));
        msg.setSubject("Hi "+s.getTenKH());
        msg.setContent("Tutorials point email", "text/html");
//		msg.setSentDate(new Date());

//		MimeBodyPart messageBodyPart = new MimeBodyPart();
//		messageBodyPart.setContent("Tutorials point email", "text/html");

//		Multipart multipart = new MimeMultipart();
//		multipart.addBodyPart(messageBodyPart);
//		MimeBodyPart attachPart = new MimeBodyPart();
//
//		attachPart.attachFile("/var/tmp/image19.png");
//		multipart.addBodyPart(attachPart);
//		msg.setContent(multipart);
        Transport.send(msg);
    }
    @Override
    public void run(){
        while (true){
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            Date date = new Date();

            System.out.println(dateFormat.format(date));
            if(dateFormat.format(date).toString().equals(gio)){
                try {
                    sendmail();
                } catch (MessagingException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
