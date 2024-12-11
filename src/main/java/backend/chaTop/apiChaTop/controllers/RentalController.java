package backend.chaTop.apiChaTop.controllers;

import backend.chaTop.apiChaTop.dto.RentalCreation;
import backend.chaTop.apiChaTop.models.User;
import backend.chaTop.apiChaTop.repositories.UserRepository;
import backend.chaTop.apiChaTop.services.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/rentals")
public class RentalController {
    @Autowired
    private RentalService rentalService;

    @PostMapping("/create")
    public ResponseEntity<?>createRental(@RequestBody RentalCreation rental) {
        return ResponseEntity.ok(rentalService.createRental(rental));
    }
}
