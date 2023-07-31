package io.ordermanagement.inventory.service;

import java.util.List;

import io.ordermanagement.inventory.model.Product;
import io.quarkus.panache.common.Page;
import io.quarkus.panache.common.Sort;

public interface IProductService {
	
	public Product findById(String id);
	
	public List<Product> findAll(Page page, Sort sort);
}
