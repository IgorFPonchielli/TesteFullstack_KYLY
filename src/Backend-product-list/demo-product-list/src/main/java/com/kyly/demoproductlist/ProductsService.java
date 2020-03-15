package com.kyly.demoproductlist;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductsService {
	
	private final ProductsController productsController;
	
	ProductsService(final ProductsController productsController) {
		this.productsController = productsController;		
	}
	
	@GetMapping("/list")
	public List<ProductsDTO> List(){
		return this.productsController.getAllProducts();
    }
	
	@GetMapping("/get/{id}")
	public ResponseEntity<ProductsDTO> getProduct(@PathVariable(value = "id") @Valid Long id) {
		final ProductsDTO productDTO = this.productsController.getProduct(id);
		if(productDTO.equals(ProductsDTO.NULL_VALUE)){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(productDTO, HttpStatus.OK);
	}

}
