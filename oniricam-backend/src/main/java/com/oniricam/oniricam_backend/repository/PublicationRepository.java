package com.oniricam.oniricam_backend.repository;

import com.oniricam.oniricam_backend.model.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationRepository extends JpaRepository<Publication, Long> { }
