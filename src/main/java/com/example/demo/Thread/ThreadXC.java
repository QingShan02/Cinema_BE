package com.example.demo.Thread;

import com.example.demo.model.SendEmail;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class ThreadXC extends Thread{
    SendEmail send;
    public ThreadXC(SendEmail send){
        this.send = send;
    }

    public void sendmail() throws AddressException, MessagingException, IOException {
        String content = "<h1>Xem phim tại T1 cinema</h1>" +
                "<p>nhớ đến xem phim : "+send.getTenPhim()+"</p>" +
                "<p>vào lúc "+send.getGioBatDau()+"</p>";
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

        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("khaiminh0401@gmail.com"));
        msg.setSubject("Hi "+send.getTenKH());
        msg.setContent(content, "text/html");
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
        SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");


        while(true){
            Date d = new Date();
            String date = f.format(d);

            if(send.getDeadline().equals(date)){
                try {
                    sendmail();
                } catch (MessagingException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            }else{
                d = new Date();
                String[] time =send.getDeadline().split(":");
                long a = (Long.parseLong(time[0])* Long.valueOf("3600000000") +(Long.parseLong(time[1]))*60000 + (Long.parseLong(time[2]))*1000) - (d.getHours()* Long.valueOf("3600000000") + d.getMinutes()*60000 + d.getSeconds()*1000);
                System.out.println(date);
                try {
                    System.out.println(a/60000);
                    Thread.sleep(a);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
}
