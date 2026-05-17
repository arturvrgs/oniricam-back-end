package com.oniricam.oniricam_backend.service;

import com.oniricam.oniricam_backend.dto.PublicationDTO;
import com.oniricam.oniricam_backend.dto.SubscriberDTO;
import com.oniricam.oniricam_backend.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
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

    public void sendEmail(String receiver, PublicationDTO dto) {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(receiver);
            message.setSubject("Nova publicação");
            message.setText(dto.getTitle());
            mailSender.send(message);
    }

    @Async
    public void notifySubscribers(PublicationDTO dto) {
        var response = subscriberService.findAll();
        if(response.getStatusCode().is2xxSuccessful() && response.hasBody() && response.getBody() != null) {
            for(SubscriberDTO subscriberDTO : response.getBody()) {
                sendEmail(subscriberDTO.getEmail(), dto);
            }
        }
    }
}

