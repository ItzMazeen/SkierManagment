package tn.esprit.spring.controllers;

import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.Skier;
import tn.esprit.spring.services.ISkierService;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/skiers")
public class SkierController {
    ISkierService skierService; //injection des dépendances

    @GetMapping("/getAllSkiers")
    public List<Skier> getAllSkiers() {
        return skierService.retrieveAllSkiers();

    }
    @PostMapping("/addSkiers")
    public  Skier addSkier(@RequestBody Skier skier){
        return skierService.addSkier(skier);
    }
    @PutMapping("/updateSkier")
    public Skier updateSkier(@RequestBody Skier skier){
        return skierService.upadateSkier(skier);
    }
    @DeleteMapping("/deleteSkier/{IdSkier}")
    public void removeSkier(@PathVariable ("IdSkier") Long IdSkier){
        skierService.removeSkier(IdSkier);
    }

    @PostMapping("/addListSkiers")
    public List<Skier> addListSkier(@RequestBody List<Skier> skiers) {
        return skierService.addListSkier(skiers);
    }

    @GetMapping("/skieurByDtae/{datedeb}/{datefin}")
    public List<Skier> skieursByDate (@PathVariable LocalDate datedeb, @PathVariable LocalDate datefin){
        return  skierService.listSkieurBydate(datedeb,datefin);
    }
}
