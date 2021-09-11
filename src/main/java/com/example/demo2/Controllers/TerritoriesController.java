package com.example.demo2.Controllers;
import com.example.demo2.entidades.Territories;
import com.example.demo2.repository.TerritoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TerritoriesController {

    @Autowired
    TerritoriesRepository territoriesRepository;
    @GetMapping("/Territorieslista")
    public String Territories(Model model){
        model.addAttribute("territorieslist", territoriesRepository.findAll());
        return "territories/Territories"; //Pruebas para descarga
    }

    @GetMapping("/territorienew")
    public String Territoriesnew(){
        return "territories/NewTerritorie";
    }

    @PostMapping("/territoriesave")
    public String Territoriessave(Territories territorie){
        System.out.println(territorie.getTerritoryid());
        System.out.println(territorie.getRegionid());
        System.out.println(territorie.getTerritorydescription());
        territoriesRepository.save(territorie);
        return "redirect:/Territorieslista";
    }





}
