package com.alloMecano.crud.services;

import com.alloMecano.crud.controller.Mecanicien;
import com.alloMecano.crud.repository.MecanicienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MecanicienService {

    private final MecanicienRepository mecanicienRepository;


 @Autowired
    public MecanicienService(MecanicienRepository mecanicienRepository) {
        this.mecanicienRepository = mecanicienRepository;
    }



//    public Mecanicien ajouterMecanicien(Mecanicien mecanicien){
//     return
//    }


    private List<Mecanicien> aymenS= Arrays.asList(
            new Mecanicien("aymen","4460 rue ontario","montreal","QC","H2A1V8",43822692,"AYMEN@GMAIL.COM","mecanicienDeFou","219 rue drapeau"),
            new Mecanicien("aymen","4460 rue ontario","montreal","QC","H2A1V8",80000000,"AYMENnn@GMAIL.COM","mecanicienDeFou","219 rue drapeau")
    );


    //  );
//
   public List<Mecanicien> findAll() {
       return aymenS;

   }

//    public Mecanicien getID(String nom) {
//        Mecanicien tofo=null;
//        for(Mecanicien tofol:aymenS){
//            if(tofol.getNom_Restaurant().equals(nom)){
//                tofo=tofol;
//                return tofo;
//            }
//        }
//        return tofo;
//    }



}
