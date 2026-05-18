package com.oniricam.oniricam_backend.service;

import com.oniricam.oniricam_backend.dto.SubscriberDTO;
import com.oniricam.oniricam_backend.mapper.SubscriberMapper;
import com.oniricam.oniricam_backend.model.Subscriber;
import com.oniricam.oniricam_backend.repository.SubscriberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriberService {

    private final SubscriberRepository repository;
    private final SubscriberMapper mapper;

    public SubscriberService(SubscriberRepository repository, SubscriberMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ResponseEntity<List<SubscriberDTO>> findAll() {
        List<SubscriberDTO> subscribers = mapper.toDTOList(repository.findAll());
        return ResponseEntity.status(HttpStatus.OK).body(subscribers);
    }

    public ResponseEntity<SubscriberDTO> add(SubscriberDTO subscriber) {
        repository.save(mapper.toModel(subscriber));
        return ResponseEntity.status(HttpStatus.OK).body(subscriber);
    }
}
