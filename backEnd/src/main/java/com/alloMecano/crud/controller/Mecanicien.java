package com.alloMecano.crud.controller;
import jakarta.persistence.*;
import static jakarta.persistence.GenerationType.SEQUENCE;


@Entity(name = "mecanicien") //ce nom n'est pas le nom de la table cest le nom de lentite quand va utiliser apres avec JPQL
@Table(
        name="mecanicien", // ce nom est pour la table (le nom de la table dans la BD)
        uniqueConstraints = {@UniqueConstraint(name = "mecanocien_email_unique",columnNames = "adresse_email")}
)
public class Mecanicien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",
    updatable = true,
    nullable = false)
    private int id;
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
    private Integer numeroDeCellulaire;
    @Column(name = "adresse_email",
            nullable = false
    )

    private String adresseEmail;

    @Column(name = "nom_de_garge",
            nullable = false)
    private String nomDeGarge;
    @Column(name = "adresse_garage",
            nullable = false)
    private String adresseGarage;

    public Long getNombreDeLikeMecanicien() {
        return nombreDeLikeMecanicien;
    }

    public void setNombreDeLikeMecanicien(Long nombreDeLikeMecanicien) {
        this.nombreDeLikeMecanicien = nombreDeLikeMecanicien;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    @Column(name = "nombre_de_like_Mecanicien")
    private Long nombreDeLikeMecanicien;
    @Column(name = "langue")
    private String langue;
    public Mecanicien(){

    }

    public Mecanicien( String nom, String adresseDomicile, String ville, String province, String codePostal, Integer numeroDeCellulaire, String adresseCourriel, String nomDeGarge, String adresseGarage) {

        this.nom = nom;
        this.adresseDomicile = adresseDomicile;
        this.ville = ville;
        province = province;
        this.codePostal = codePostal;
        this.numeroDeCellulaire = numeroDeCellulaire;
        this.adresseEmail = adresseCourriel;
        this.nomDeGarge = nomDeGarge;
        this.adresseGarage = adresseGarage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getAdresseCourriel() {
        return adresseEmail;
    }

    public void setAdresseCourriel(String adresseEmail) {
        this.adresseEmail = adresseEmail;
    }

    public String getNomDeGarge() {
        return nomDeGarge;
    }

    public void setNomDeGarge(String nomDeGarge) {
        this.nomDeGarge = nomDeGarge;
    }

    public String getAdresseGarage() {
        return adresseGarage;
    }

    public void setAdresseGarage(String adresseGarage) {
        this.adresseGarage = adresseGarage;
    }
}
