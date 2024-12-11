package backend.chaTop.apiChaTop.services;

import backend.chaTop.apiChaTop.dto.RentalCreation;
import backend.chaTop.apiChaTop.mappers.RentalMapper;
import backend.chaTop.apiChaTop.models.Rental;
import backend.chaTop.apiChaTop.repositories.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentalService {
    @Autowired
    private RentalRepository rentalRepository;

    @Autowired
    private RentalMapper rentalMapper;

    public Rental createRental(RentalCreation rentalCreation) {
        return rentalRepository.save(rentalMapper.mapFromRentalCreationDto(rentalCreation));
    }
}
