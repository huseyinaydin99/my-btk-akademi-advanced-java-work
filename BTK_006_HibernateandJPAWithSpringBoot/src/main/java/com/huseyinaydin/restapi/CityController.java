package com.huseyinaydin.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huseyinaydin.model.City;
import com.huseyinaydin.services.ICityService;

@RestController
@RequestMapping("/api")
public class CityController {
	
	@Autowired
	private ICityService cityService;

	public CityController(ICityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@GetMapping("/cities")
	public List<City> getCities(){
		return this.cityService.getCities();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody City city){
		this.cityService.addCity(city);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody City city){
		this.cityService.updateCity(city);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody City city){
		this.cityService.deleteCity(city);
	}
	
	@PostMapping("/cities/{id}")
	public City getById(@PathVariable("id") int id){
		return this.cityService.getCityById(id);
	}
}
