package com.ecommerce.microcommerce.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecommerce.microcommerce.model.Product;

@Repository
/*
 * @Repository : cette annotation est appliquée à la classe afin d'indiquer à Spring qu'il s'agit 
 * d'une classe qui gère les données,
 * ce qui nous permettra de profiter de certaines fonctionnalités comme les translations des erreurs. 
 * Nous y reviendrons.
 */
public class ProductDaoImpl implements ProductDao {

	public static List<Product>products = new ArrayList<>();
	static {
		products.add(new Product(1, new String("Ordinateur portable"), 350));
		products.add(new Product(2, new String("Aspirateur Robot"), 500)); 
		products.add(new Product(3, new String("Table de Ping Pong"), 750));
	}
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public Product findById(int id) {
		for(Product product: products) {
			if(product.getId() == id ) {
				return product;
			}
		}
		return null;
	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		products.add(product);
		return product;
	}

}
