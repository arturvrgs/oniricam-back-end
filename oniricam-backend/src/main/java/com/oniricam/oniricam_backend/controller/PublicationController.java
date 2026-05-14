package com.oniricam.oniricam_backend.controller;

import com.oniricam.oniricam_backend.dto.PublicationDTO;
import com.oniricam.oniricam_backend.service.PublicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicationController {

    public final PublicationService service;

    public PublicationController(PublicationService service) {
        this.service = service;
    }

    @PostMapping("/publications")
    public ResponseEntity<PublicationDTO> add(@RequestBody PublicationDTO dto) {
        return service.add(dto);
    }
}
