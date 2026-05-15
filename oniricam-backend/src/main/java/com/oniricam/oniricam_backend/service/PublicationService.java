package com.oniricam.oniricam_backend.service;

import com.oniricam.oniricam_backend.dto.PublicationDTO;
import com.oniricam.oniricam_backend.mapper.PublicationMapper;
import com.oniricam.oniricam_backend.model.Publication;
import com.oniricam.oniricam_backend.repository.PublicationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PublicationService {

    private final PublicationRepository repository;
    private PublicationMapper mapper;

    public PublicationService(PublicationRepository repository) {
        this.repository = repository;
    }

    public ResponseEntity<PublicationDTO> add(PublicationDTO dto) {
        Publication saved = repository.save(mapper.toModel(dto));
        return ResponseEntity.status(HttpStatus.OK).body(mapper.toDTO(saved));
    }
}
