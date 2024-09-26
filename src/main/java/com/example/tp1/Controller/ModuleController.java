package com.example.tp1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.example.tp1.Services.ModuleService;
import com.example.tp1.Modeles.Module;

@RestController
public class ModuleController {

    @Autowired
    private ModuleService moduleService;

    // Endpoint pour obtenir un module par ID
    @GetMapping("/Modules/{id}")
    public Module getModules(@PathVariable Integer id) {
        return moduleService.getModules(id);
    }

    // Endpoint pour ajouter un module
    @PostMapping("/Modules")
    public void ajouterModule(@RequestBody Module module) {
        moduleService.ajouterModule(module);
    }


    @RequestMapping(method=RequestMethod.PUT, value="/Modules/{id}")
    public void modifierModule(@RequestBody Module module, @PathVariable Integer id) {
        moduleService.modifierModule(id, module);
    }


    @DeleteMapping("/Modules/{id}")
    public ResponseEntity<Void> supprimerModule(@PathVariable Integer id) {
        moduleService.supprimerModule(id);
        return ResponseEntity.noContent().build(); // Retourner 204 No Content
    }
}
