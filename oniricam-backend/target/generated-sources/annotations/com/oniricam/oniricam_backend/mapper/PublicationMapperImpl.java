package com.oniricam.oniricam_backend.mapper;

import com.oniricam.oniricam_backend.dto.PublicationDTO;
import com.oniricam.oniricam_backend.model.Publication;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-16T18:20:55-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Oracle Corporation)"
)
@Component
public class PublicationMapperImpl implements PublicationMapper {

    @Override
    public Publication toModel(PublicationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Publication publication = new Publication();

        publication.setTitle( dto.getTitle() );
        publication.setContentUrl( dto.getContentUrl() );
        publication.setBannerUrl( dto.getBannerUrl() );

        return publication;
    }

    @Override
    public PublicationDTO toDTO(Publication model) {
        if ( model == null ) {
            return null;
        }

        PublicationDTO publicationDTO = new PublicationDTO();

        publicationDTO.setTitle( model.getTitle() );
        publicationDTO.setContentUrl( model.getContentUrl() );
        publicationDTO.setBannerUrl( model.getBannerUrl() );

        return publicationDTO;
    }

    @Override
    public List<PublicationDTO> toDTOList(List<Publication> publications) {
        if ( publications == null ) {
            return null;
        }

        List<PublicationDTO> list = new ArrayList<PublicationDTO>( publications.size() );
        for ( Publication publication : publications ) {
            list.add( toDTO( publication ) );
        }

        return list;
    }
}
