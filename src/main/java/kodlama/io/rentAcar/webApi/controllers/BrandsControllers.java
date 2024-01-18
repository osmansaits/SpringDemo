package kodlama.io.rentAcar.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentAcar.business.abstracts.BrandService;
import kodlama.io.rentAcar.entities.concretes.Brand;

//Annotation
@RestController
@RequestMapping("/api/brands")
public class BrandsControllers {
	private BrandService brandService;

	public BrandsControllers(BrandService brandService) {
		this.brandService = brandService;
	}
	
	@GetMapping("/getall")
	public List<Brand> getAll(){
		return brandService.getAll();
	}
	
	
}
