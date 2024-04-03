package backEnd.src.main.java.com.alloMecano.crud.controller;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Table(
        name="users", // ce nom est pour la table (le nom de la table dans la BD)
        uniqueConstraints = {@UniqueConstraint(name = "user_email_unique",columnNames = "adresse_email")})
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",
            updatable = true,
            nullable = false)
    private Long id;
    @Column(name = "nom",
            nullable = false)
    private String  nom;
    @Column(name = "adresse_domicile",
            nullable = false)
    private String adresseDomicile;
    @Column(name = "ville",
            nullable = false)
    private String ville;
    @Column(name = "province")
    private String province;
    @Column(name = "code_postal",
            nullable = false)
    private String codePostal;
    @Column(name = "numero_de_cellulaire",
            nullable = false)
    private Long numeroDeCellulaire;
    @Column(name = "adresse_email",
            nullable = false
    )

    private String adresseEmail;
    @Column(name = "mot_de_passe",
            nullable = false
    )
    private String motDePasse;


//    public User(Long id, String nom, String adresseDomicile, String ville, String province, String codePostal, Long numeroDeCellulaire, String adresseEmail, String motDePasse) {
//        this.id = id;
//        this.nom = nom;
//        this.adresseDomicile = adresseDomicile;
//        this.ville = ville;
//        this.province = province;
//        this.codePostal = codePostal;
//        this.numeroDeCellulaire = numeroDeCellulaire;
//        this.adresseEmail = adresseEmail;
//        this.motDePasse=motDePasse;
//    }



//    public User() {
//
//    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//
//    public void setNom(String nom) {
//        this.nom = nom;
//    }
//
//    public String getAdresseDomicile() {
//        return adresseDomicile;
//    }
//
//    public void setAdresseDomicile(String adresseDomicile) {
//        this.adresseDomicile = adresseDomicile;
//    }
//
//    public String getVille() {
//        return ville;
//    }
//
//    public void setVille(String ville) {
//        this.ville = ville;
//    }
//
//    public String getProvince() {
//        return province;
//    }
//
//    public void setProvince(String province) {
//        this.province = province;
//    }
//
//    public String getCodePostal() {
//        return codePostal;
//    }
//
//    public void setCodePostal(String codePostal) {
//        this.codePostal = codePostal;
//    }
//
//    public Long getNumeroDeCellulaire() {
//        return numeroDeCellulaire;
//    }
//
//    public void setNumeroDeCellulaire(Long numeroDeCellulaire) {
//        this.numeroDeCellulaire = numeroDeCellulaire;
//    }
//
//    public String getAdresseEmail() {
//        return adresseEmail;
//    }
//
//    public void setAdresseEmail(String adresseEmail) {
//        this.adresseEmail = adresseEmail;
//    }
//
//    public String getMotDePasse() {
//        return motDePasse;
//    }
//
//    public void setMotDePasse(String motDePasse) {
//        this.motDePasse = motDePasse;
//    }
//    @Column(name = "aymen")
//    @Builder.Default
//    private String  aymen;

    @Enumerated(EnumType.STRING)
    Role role;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getPassword() {
        return motDePasse;
    }

    @Override
    public String getUsername() {
        return adresseEmail;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
