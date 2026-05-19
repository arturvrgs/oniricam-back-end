package com.oniricam.oniricam_backend.mapper;

import com.oniricam.oniricam_backend.dto.PublicationDTO;
import com.oniricam.oniricam_backend.dto.SubscriberDTO;
import com.oniricam.oniricam_backend.model.Publication;
import com.oniricam.oniricam_backend.model.Subscriber;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-16T18:16:40-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Oracle Corporation)"
)
@Component
public class SubscriberMapperImpl implements SubscriberMapper {

    @Override
    public Publication toModel(SubscriberDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Publication publication = new Publication();

        return publication;
    }

    @Override
    public PublicationDTO toDTO(Subscriber model) {
        if ( model == null ) {
            return null;
        }

        PublicationDTO publicationDTO = new PublicationDTO();

        return publicationDTO;
    }

    @Override
    public List<SubscriberDTO> toDTOList(List<Subscriber> subscribers) {
        if ( subscribers == null ) {
            return null;
        }

        List<SubscriberDTO> list = new ArrayList<SubscriberDTO>( subscribers.size() );
        for ( Subscriber subscriber : subscribers ) {
            list.add( subscriberToSubscriberDTO( subscriber ) );
        }

        return list;
    }

    protected SubscriberDTO subscriberToSubscriberDTO(Subscriber subscriber) {
        if ( subscriber == null ) {
            return null;
        }

        SubscriberDTO subscriberDTO = new SubscriberDTO();

        subscriberDTO.setEmail( subscriber.getEmail() );
        subscriberDTO.setFirstname( subscriber.getFirstname() );
        subscriberDTO.setLastname( subscriber.getLastname() );

        return subscriberDTO;
    }
}
