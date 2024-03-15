package com.alloMecano.crud.services;

import com.alloMecano.crud.controller.Mecanicien;
import com.alloMecano.crud.repository.MecanicienRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MecanoService {
//
//
private static final Logger logger = LoggerFactory.getLogger(MecanoService.class);

    private List<Mecanicien> aymenS= Arrays.asList(
           new Mecanicien("aymen","4460 rue ontario","montreal","QC","H2A1V8",43822692,"AYMEN@GMAIL.COM","mecanicienDeFou","219 rue drapeau"),
        new Mecanicien("aymen","4460 rue ontario","montreal","QC","H2A1V8",80000000,"AYMENnn@GMAIL.COM","mecanicienDeFou","219 rue drapeau")
);


//  );
//
   public List<Mecanicien> findAll() {
       logger.info("Début de la méthode findAll() dans MecanoService");
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
