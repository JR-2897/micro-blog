package ynov.jean.clientblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ynov.jean.clientblog.proxies.MSCategorieProxy;
import ynov.jean.clientblog.model.Categorie;

@Controller
public class HomeController {

	@Autowired
    private MSCategorieProxy categorieProxy;
	
	@RequestMapping("/")
    public String accueil(Model model){

        List<Categorie> categories =  categorieProxy.getCategories();

        model.addAttribute("categories", categories);

        return "Home";
    }
	
	@RequestMapping("/{name_categorie}")
}
