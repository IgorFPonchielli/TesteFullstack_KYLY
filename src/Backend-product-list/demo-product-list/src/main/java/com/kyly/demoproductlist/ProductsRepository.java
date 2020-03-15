package com.kyly.demoproductlist;

import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<ProductsEntity, Long> {

}
