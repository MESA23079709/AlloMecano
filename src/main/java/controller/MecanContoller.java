package controller;

import model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.MecanoService;

import java.util.List;

@RestController
@RequestMapping(value="")
public class MecanContoller {
    @Autowired
    private MecanoService aymens;

    @GetMapping(value="/ro")
    public List<Todo> okok(){
        return aymens.findAll();

    }

    @GetMapping(value="/{namee}")
    public String greetingwithname(@PathVariable String namee){
        return String.format("welcome %s to me", namee);

    }
    @GetMapping(value ="/shih/{shih}" )
    public String greetingwithchera(@PathVariable boolean shih){
        String mnayak;
        if(shih){
            mnayak= "shih rah true";
        }else if (!shih){
            mnayak="shih rah FALSE";
        }else{
            mnayak="else ";
        }
        return String.format(mnayak);

    }
    @GetMapping("/nomR/{nom}")
    public Todo obtenirExempleParId(@PathVariable String nom) {
        return aymens.getID(nom);
    }
    @GetMapping("/Restaurant/roo/ok")
    public Todo jibTodo(){
        return new Todo("Gros luxe","1110 boulevard rome");
    }
}
