package backend.chaTop.apiChaTop.mappers;

import backend.chaTop.apiChaTop.dto.RegisterRequest;
import backend.chaTop.apiChaTop.dto.RentalCreation;
import backend.chaTop.apiChaTop.models.Rental;
import org.springframework.stereotype.Component;

@Component
public class RentalMapper {

    public Rental mapFromRentalCreationDto(RentalCreation rentalCreation) {

        Rental rental = new Rental();
        rental.setName(rentalCreation.getName());
        rental.setSurface(rentalCreation.getSurface());
        rental.setPrice(rentalCreation.getPrice());
        rental.setPicture(rentalCreation.getPicture());
        rental.setDescription(rentalCreation.getDescription());
        rental.setOwner_id(rentalCreation.getOwner_id());

        return rental;
    }
}
