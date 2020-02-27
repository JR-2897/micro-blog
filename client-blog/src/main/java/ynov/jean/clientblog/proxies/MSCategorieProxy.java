package ynov.jean.clientblog.proxies;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name= "blogbackcategorie")
@RibbonClient(name= "blogbackcategorie")

public interface MSCategorieProxy {

	@GetMapping(value = "/categories")
	List<Categorie> getCategories();
	
	@GetMapping(value = "/categories/{id}")
	Optional<Categorie> getCategorie(@PathVariable("id") Long id);
}
