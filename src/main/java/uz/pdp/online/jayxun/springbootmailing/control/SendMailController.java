package uz.pdp.online.jayxun.springbootmailing.control;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.online.jayxun.springbootmailing.dto.SendMailDto;
import uz.pdp.online.jayxun.springbootmailing.service.MailService;

@RestController
@RequestMapping("/api/mail/send")
@RequiredArgsConstructor
public class SendMailController {
    private final MailService mailService;

    @PostMapping
    public void sendMail(@RequestBody SendMailDto sendMailDto){
        mailService.sendSimpleMail(sendMailDto);
    }
}
