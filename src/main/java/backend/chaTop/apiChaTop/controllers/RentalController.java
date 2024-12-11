package backend.chaTop.apiChaTop.controllers;

import backend.chaTop.apiChaTop.dto.RentalCreation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/rentals")
public class RentalController {
    public ResponseEntity<?>createRental(RentalCreation rental) {
        return null;
    }
}
