package model;


public class Todo {

    String nom_Restaurant;
    String adresse;

    public Todo(String nomR,String add){
        nom_Restaurant=nomR;
        adresse=add;

    }

    public String getAdresse() {
        return adresse;
    }

    public String getNom_Restaurant() {
        return nom_Restaurant;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNom_Restaurant(String nom_Restaurant) {
        this.nom_Restaurant = nom_Restaurant;
    }
}
