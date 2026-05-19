package com.oniricam.oniricam_backend.service;

import com.oniricam.oniricam_backend.dto.PublicationDTO;
import com.oniricam.oniricam_backend.dto.SubscriberDTO;
import com.oniricam.oniricam_backend.model.Email;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {
    @Autowired
    private final JavaMailSender mailSender;
    private final SubscriberService subscriberService;

    public EmailService(JavaMailSender mailSender, SubscriberService subscriberService) {
        this.mailSender = mailSender;
        this.subscriberService = subscriberService;
    }

    public void sendEmail(String receiver, Email email) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setTo(receiver);
        helper.setSubject(email.getSubject());
        helper.setText(email.getBody(), true);

        mailSender.send(message);
    }

    private Email createEmail(String name, PublicationDTO publicationDto) {
        String serializedBody = Email.serializeEmailBody(name, publicationDto.getBannerUrl(), publicationDto.getContentUrl());
        return new Email(name, publicationDto.getTitle(), serializedBody);
    }

    @Async
    public void notifySubscribers(PublicationDTO dto) throws MessagingException {
        var response = subscriberService.findAll();
        if(response.getStatusCode().is2xxSuccessful() && response.hasBody() && response.getBody() != null) {
            for(SubscriberDTO subscriberDTO : response.getBody()) {
                Email publicationEmail = createEmail(subscriberDTO.getFirstname(), dto);
                sendEmail(subscriberDTO.getEmail(), publicationEmail);
            }
        }
    }
}

