package com.oniricam.oniricam_backend.mapper;

import com.oniricam.oniricam_backend.dto.PublicationDTO;
import com.oniricam.oniricam_backend.model.Publication;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PublicationMapper {
    Publication toModel(PublicationDTO dto);
    PublicationDTO toDTO(Publication model);
    List<PublicationDTO> toDTOList(List<Publication> publications);
}
