package com.oniricam.oniricam_backend.service;

import com.oniricam.oniricam_backend.dto.PublicationDTO;
import com.oniricam.oniricam_backend.dto.SubscriberDTO;
import com.oniricam.oniricam_backend.mapper.PublicationMapper;
import com.oniricam.oniricam_backend.model.Publication;
import com.oniricam.oniricam_backend.repository.PublicationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PublicationService {

    private final PublicationRepository repository;
    private final PublicationMapper mapper;
    private final EmailService emailService;
    private final SubscriberService subscriberService;

    public PublicationService(PublicationRepository repository, PublicationMapper mapper, EmailService  emailService, SubscriberService subscriberService) {
        this.repository = repository;
        this.mapper = mapper;
        this.emailService = emailService;
        this.subscriberService = subscriberService;
    }

    public ResponseEntity<PublicationDTO> add(PublicationDTO dto) {
        Publication saved = repository.save(mapper.toModel(dto));
        emailService.notifySubscribers(dto);
        return ResponseEntity.status(HttpStatus.OK).body(mapper.toDTO(saved));
    }
}
