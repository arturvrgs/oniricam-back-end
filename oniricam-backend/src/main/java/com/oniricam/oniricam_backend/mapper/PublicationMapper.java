package com.oniricam.oniricam_backend.mapper;

import com.oniricam.oniricam_backend.dto.PublicationDTO;
import com.oniricam.oniricam_backend.model.Publication;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PublicationMapper {

    @Mapping(target = "publishedAt", ignore = true)
    Publication toModel(PublicationDTO dto);
    PublicationDTO toDTO(Publication model);
    List<PublicationDTO> toDTOList(List<Publication> publications);
}
