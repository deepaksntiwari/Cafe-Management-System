package com.deepaksntiwari.Cafe.Management.System.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EmailUtils {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendSimpleMessage(String to, String subject, String text, List<String> mailList) {
        log.info("Mail sent {}",
                to);
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("emailaddressfordevtesting@gmail.com");
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(text);
        if (!mailList.isEmpty())
            simpleMailMessage.setCc(getEmailArrayFromList(mailList));

        javaMailSender.send(simpleMailMessage);

    }

    private String[] getEmailArrayFromList(List<String> mailList) {
        String[] cc = new String[mailList.size()];

        for (int i = 0; i < mailList.size(); i++) {
            cc[i] = mailList.get(i);
        }
        return cc;
    }
}
