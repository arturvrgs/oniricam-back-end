package com.oniricam.oniricam_backend.mapper;

import com.oniricam.oniricam_backend.dto.SubscriberDTO;
import com.oniricam.oniricam_backend.model.Subscriber;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SubscriberMapper {
    Subscriber toModel(SubscriberDTO dto);
    SubscriberDTO toDTO(Subscriber model);
    List<SubscriberDTO> toDTOList(List<Subscriber> subscribers);
}
