package com.alloMecano.crud.controller;

import com.alloMecano.crud.services.MecanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.alloMecano.crud.repository.MecanicienRepository;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value="")
public class MecanContoller{
    @Autowired
    private MecanicienRepository mecanicienRepository;
    @Autowired
    private MecanoService mecanoService;
    @Autowired
    public MecanContoller(MecanicienRepository mecanicienRepository){
        this.mecanicienRepository=mecanicienRepository;
    }

@PostMapping(value="/ajouterMecanicien")
    public ResponseEntity<Mecanicien> ajouterMecanicien(@RequestBody Mecanicien mecanicien){

    try{
        Mecanicien nouveauMecanicien= mecanicienRepository.save(mecanicien);
        return new ResponseEntity<>(nouveauMecanicien, HttpStatus.CREATED);
    }catch(Exception e){
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
@GetMapping("/getAllMecaniciens")
    public ResponseEntity<List<Mecanicien>> getAllMecaniciens(){
    try{
        List<Mecanicien> mecanicienList =mecanicienRepository.findAll();
        if(mecanicienList==null || mecanicienList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(mecanicienList,HttpStatus.OK);
    }catch (Exception e){
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
    @GetMapping("/wino/aymen")
    public List<Mecanicien> getAlMecaniciens() {
        List<Mecanicien> mecanicienListtt = mecanoService.findAll();
        return mecanicienListtt;
    }
    @GetMapping("/getMecanicienParId/{id}")
    public ResponseEntity <Optional<Mecanicien>> getMecanicienParId( @PathVariable Long id){

        try{
            Optional<Mecanicien> mecanicien=mecanicienRepository.findById(id);
            if(mecanicien.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(mecanicien,HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
