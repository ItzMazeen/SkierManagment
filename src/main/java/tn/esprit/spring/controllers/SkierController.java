package tn.esprit.spring.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.entities.Skier;
import tn.esprit.spring.services.ISkierService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/skiers")
public class SkierController {
    ISkierService skierService;
    @GetMapping("/getAllSkiers")
    public List<Skier> getAllSkiers(){
        return skierService.retrieveAllSkiers();
    }
}
