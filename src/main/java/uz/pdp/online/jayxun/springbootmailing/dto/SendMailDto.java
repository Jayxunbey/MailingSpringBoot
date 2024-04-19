package uz.pdp.online.jayxun.springbootmailing.dto;

import lombok.Getter;

@Getter
public class SendMailDto {
    private String to;
    private String subject;
    private String content;
}
