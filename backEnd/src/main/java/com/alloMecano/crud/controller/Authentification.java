package com.alloMecano.crud.controller;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "Authentification")
@Table(
        name="authentification", // ce nom est pour la table (le nom de la table dans la BD)
        uniqueConstraints = {@UniqueConstraint(name = "authentification_email_unique",columnNames = "adresse_email_Auth")}
)
public class Authentification {
    @Id
    @SequenceGenerator(name = "mecanicien_sequence_name",
            sequenceName = "mecanicien_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE,
            generator = "mecanicien_sequence")
    @Column(name = "id",
            updatable = false,
            nullable = false)
    private int id;
    @Column(name = "adresse_email_Auth",
            nullable = false
    )
    private String adresseEmailAuth;
    @Column(name = "mot_de_passe",
            nullable = false

    )
    private String motDePasse;
}
