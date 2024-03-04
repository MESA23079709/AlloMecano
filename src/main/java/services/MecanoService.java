package services;

import model.Todo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MecanoService {

    private List<Todo> aymenS=Arrays.asList(
            new Todo("grosLuxeommomom", "4460 rue marquette"),
            new Todo("gros", "4460 rue fabre")
    );

    public List<Todo> findAll() {
        return aymenS;
    }
    public Todo getID(String nom) {
        Todo tofo=null;
        for(Todo tofol:aymenS){
            if(tofol.getNom_Restaurant().equals(nom)){
                tofo=tofol;
                return tofo;
            }
        }
        return tofo;
    }



}
