package backEnd.src.main.java.com.alloMecano.crud.auth;

import backEnd.src.main.java.com.alloMecano.crud.config.JwtService;
import backEnd.src.main.java.com.alloMecano.crud.repository.UserRepository;
import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.userdetails.User;
import backEnd.src.main.java.com.alloMecano.crud.controller.User;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private  UserRepository repository;
    private JwtService jwtService;
    private AuthenticationManager authenticationManager;
    private PasswordEncoder passwordEncoder;
    //

    public AuthenticationResponse register(RegisterRequest request) {
 var user = User.builder()
        .nom(request.getNom())
         .adresseDomicile(request.getAdresseDomicile())
         .ville(request.getVille())
         .province(request.getProvince())
         .codePostal(request.getCodePostal())
         .adresseEmail(request.getAdresseEmail())
         .numeroDeCellulaire(request.getNumeroDeCellulaire())
        .motDePasse(passwordEncoder.encode(request.getMotDePasse()))
        .build();
  repository.save(user);
  var jwtToken=jwtService.generateToken(user);
        return  AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getMotDePasse()
                )
        );
        var user=repository.findByEmail(request.getEmail())
                .orElseThrow();
        var jwtToken=jwtService.generateToken(user);
        return  AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}
