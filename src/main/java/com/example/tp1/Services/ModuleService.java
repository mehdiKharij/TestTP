package com.example.tp1.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.tp1.Modeles.Module;

@Service
public class ModuleService {

    private List<Module> modules = new ArrayList<>(Arrays.asList(
            new Module(10, "Java SE", "Description de la plateforme Java SE"),
            new Module(12, "Java EE", "Description de la plateforme Java EE")
    ));

    // Méthode pour obtenir un module par ID
    public Module getModules(Integer id) {
        for (Module module : modules) {
            if (id.equals(module.getId())) {
                return module;
            }
        }
        return null; // Renvoie null si le module n'est pas trouvé
    }


    // Méthode pour ajouter un module
    public void ajouterModule(Module module) {
        modules.add(module);
    }

    public void modifierModule(Integer id, Module module) {
        for (int i = 0; i < modules.size(); i++) {
            Module m = modules.get(i);
            if (id.equals(m.getId())) {
                // Remplacer l'ancien module par le nouveau
                module.setId(id); // Assurez-vous de conserver l'ID du module d'origine
                modules.set(i, module);
                return; // Terminer la méthode une fois le module mis à jour
            }
        }
        // Optionnel : lancer une exception ou un message si le module n'est pas trouvé
    }


    public void supprimerModule(Integer id) {
        modules.removeIf(m -> id.equals(m.getId()));
    }
}
