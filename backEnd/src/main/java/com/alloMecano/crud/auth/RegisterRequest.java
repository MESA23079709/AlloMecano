package backEnd.src.main.java.com.alloMecano.crud.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest  {



    private String  nom;

    private String adresseDomicile;

    private String ville;

    private String province;

    private String codePostal;

    private Long numeroDeCellulaire;


    private String adresseEmail;

    private String motDePasse;


}
