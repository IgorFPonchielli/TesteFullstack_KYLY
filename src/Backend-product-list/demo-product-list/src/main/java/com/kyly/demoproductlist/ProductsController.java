package com.kyly.demoproductlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;

@Controller
public class ProductsController {
	
	private final ProductsRepository productRepository;
	
	ProductsController(final ProductsRepository productsRepository) {
		this.productRepository = productsRepository;
	}
	
	/*private static ProductsEntity toEntity(final ProductsDTO productsDTO) {
		final Long id = productsDTO.getId();
		final int procuct = productsDTO.getProduto();
		final String descProduct = productsDTO.getDescProduto();
		final int color = productsDTO.getCor();
		final String descColor = productsDTO.getDescCor();
		final int size = productsDTO.getTamanho();
		final String descSize = productsDTO.getDescTamanho();
		
		return new ProductsEntity(id, procuct, descProduct, color, descColor, size, descSize);
	}*/
	
	public static ProductsDTO toDTO(final ProductsEntity productsEntity) {
		final Long id = productsEntity.getId();
		final String procuctId = productsEntity.getProdutoId();
		final String procuct = productsEntity.getProduto();
		final String descProduct = productsEntity.getDescProduto();
		final String color = productsEntity.getCor();
		final String descColor = productsEntity.getDescCor();
		final String size = productsEntity.getTamanho();
		final String descSize = productsEntity.getDescTamanho();
		
		return new ProductsDTO(id, procuctId, procuct, descProduct, color, descColor, size, descSize);
	}
	
	List<ProductsDTO> getAllProducts(){
		final List<ProductsDTO> products = new ArrayList<>();
		this.productRepository.findAll().forEach(productsEntity -> products.add(ProductsController.toDTO(productsEntity)));
		
		return products;
		
	}
	
	ProductsDTO getProduct(final Long id) {
		final Optional<ProductsEntity> optionalProduct = this.productRepository.findById(id);
		if(optionalProduct.isPresent()) {
			return ProductsController.toDTO(optionalProduct.get());
		}
		return ProductsDTO.NULL_VALUE;
	}
	
}
