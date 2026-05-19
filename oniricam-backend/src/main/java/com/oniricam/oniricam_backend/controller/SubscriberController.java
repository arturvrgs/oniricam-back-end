package com.oniricam.oniricam_backend.controller;

import com.oniricam.oniricam_backend.dto.SubscriberDTO;
import com.oniricam.oniricam_backend.service.SubscriberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("oniricam/subscribers")
public class SubscriberController {

    public final SubscriberService service;

    SubscriberController(SubscriberService service) {
        this.service = service;
    }

    public ResponseEntity<SubscriberDTO> add(@RequestBody SubscriberDTO dto) {
        return service.add(dto);
    }

    public ResponseEntity<List<SubscriberDTO>> list() {
        return service.findAll();
    }

    @GetMapping("/healthCheck")
    public String healthCheck() {
        return "OK";
    }
}
