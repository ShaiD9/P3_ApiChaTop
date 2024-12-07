package backend.chaTop.apiChaTop.services;

import backend.chaTop.apiChaTop.dto.RegisterRequest;
import backend.chaTop.apiChaTop.mappers.UserMapper;
import backend.chaTop.apiChaTop.models.User;
import backend.chaTop.apiChaTop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserMapper mapper;

    // Méthode d'enregistrement
    public String registerUser(RegisterRequest registerRequest) {
        if (userRepository.existsByEmail(registerRequest.getEmail())) {
            throw new RuntimeException("Email déjà utilisé");
        }

        // Créer un nouvel utilisateur

        // Sauvegarder l'utilisateur dans la base de données
        userRepository.save(mapper.mapFromRegisterDto(registerRequest));

        return "Utilisateur enregistré avec succès";
    }
}
