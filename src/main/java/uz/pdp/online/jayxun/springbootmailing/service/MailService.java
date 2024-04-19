package uz.pdp.online.jayxun.springbootmailing.service;

import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import uz.pdp.online.jayxun.springbootmailing.dto.SendMailDto;

@Component
@RequiredArgsConstructor
public class MailService {

    private final JavaMailSender mailSender;

    public void sendSimpleMail(SendMailDto sendMailDto) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(sendMailDto.getTo());
        message.setSubject(sendMailDto.getSubject());
        message.setText(sendMailDto.getContent());

        mailSender.send(message);


    }

}
