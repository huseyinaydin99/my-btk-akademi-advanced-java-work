package com.huseyinaydin.SpringBootDemo.apidemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	
	@GetMapping("/")
	public String get() {
		return "laptop";
	}
	
	@GetMapping("/products")
	public String get2() {
		return "laptop 4";
	}
}
