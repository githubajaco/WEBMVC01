package fr.diginamic.webmvc01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

	public HomeController() {
		
	}
	
	@GetMapping
	public String home(Model model) {
		
		String dTitre = "Gestion biblio";		
		model.addAttribute("titre", dTitre);
		String dBienvenue = "Bienvenue sur gestion-biblio !";
		model.addAttribute("presentation", dBienvenue);
		
		return "home"; 
		
	}
	

}
