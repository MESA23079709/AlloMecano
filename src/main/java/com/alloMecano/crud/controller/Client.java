package com.alloMecano.crud.controller;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "Client")
@Table(
        name="client", // ce nom est pour la table (le nom de la table dans la BD)
        uniqueConstraints = {@UniqueConstraint(name = "client_email_unique",columnNames = "adresse_email")}
)
public class Client {
    @Id
    @SequenceGenerator(name = "client_sequence_name",
            sequenceName = "client_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE,
            generator = "client_sequence")
    @Column(name = "id",
            updatable = false,
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
    @Column(name = "province",
            nullable = false)
    private String province;
    @Column(name = "code_postal",
            nullable = false)
    private String codePostal;
    @Column(name = "numero_de_cellulaire",
            nullable = false)
    private Integer numeroDeCellulaire;
    @Column(name = "adresse_email",
            nullable = false
    )
    private String adresseEmail;
    @Column(name = "nombre_de_like_Client")
    private Long nombreDeLikeClient;

    public Client(String nom, String adresseDomicile, String ville, String province, String codePostal, Integer numeroDeCellulaire, String adresseEmail) {
        this.nom = nom;
        this.adresseDomicile = adresseDomicile;
        this.ville = ville;
        this.province = province;
        this.codePostal = codePostal;
        this.numeroDeCellulaire = numeroDeCellulaire;
        this.adresseEmail = adresseEmail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresseDomicile() {
        return adresseDomicile;
    }

    public void setAdresseDomicile(String adresseDomicile) {
        this.adresseDomicile = adresseDomicile;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public Integer getNumeroDeCellulaire() {
        return numeroDeCellulaire;
    }

    public void setNumeroDeCellulaire(Integer numeroDeCellulaire) {
        this.numeroDeCellulaire = numeroDeCellulaire;
    }

    public String getAdresseEmail() {
        return adresseEmail;
    }

    public void setAdresseEmail(String adresseEmail) {
        this.adresseEmail = adresseEmail;
    }

    public Long getNombreDeLikeClient() {
        return nombreDeLikeClient;
    }

    public void setNombreDeLikeClient(Long nombreDeLikeClient) {
        this.nombreDeLikeClient = nombreDeLikeClient;
    }
}
