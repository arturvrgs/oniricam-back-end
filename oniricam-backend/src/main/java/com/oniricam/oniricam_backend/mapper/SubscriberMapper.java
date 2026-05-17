package com.oniricam.oniricam_backend.mapper;

import com.oniricam.oniricam_backend.dto.PublicationDTO;
import com.oniricam.oniricam_backend.dto.SubscriberDTO;
import com.oniricam.oniricam_backend.model.Publication;
import com.oniricam.oniricam_backend.model.Subscriber;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SubscriberMapper {
    Publication toModel(SubscriberDTO dto);
    PublicationDTO toDTO(Subscriber model);
    List<SubscriberDTO> toDTOList(List<Subscriber> subscribers);
}
