package backend.chaTop.apiChaTop.services;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.chaTop.apiChaTop.dto.LoginRequest;

@Service
public class AuthService {

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public AuthService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    // Votre logique d'authentification, comme l'encryptage du mot de passe
    public String authenticate(String password) {
        // Utilisation du passwordEncoder ici
        String encodedPassword = passwordEncoder.encode(password);
        // Logique de validation etc.
        return encodedPassword;
    }

    public String authenticateUser(LoginRequest loginRequest) {
        throw new UnsupportedOperationException("Unimplemented method 'authenticateUser'");
    }
    
}
