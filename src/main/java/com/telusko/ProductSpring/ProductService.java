package com.telusko.ProductSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public void show() {
        System.out.println("in show");
    }

@Autowired
    ProductDB db;
	
//	public void addProduct(Product p) {
////		products.add(p);
//
//		db.save(p);
//
//	}
//
	public List<Product> getAllProducts() {
//		return products;
		return db.findAll();
	}
//
//	public List<Product> getProductWithText(String name) {
//		return db.getProductWithName(name);
//	}
//
////	public List<Product> getProductWithText(String string) {
////
////		String str = string.toLowerCase();
//
////		List<Product> prods = new ArrayList<>();
////		for(Product p : products) {
////			String name = p.getName().toLowerCase();
////			String type = p.getType().toLowerCase();
////			String place = p.getPlace().toLowerCase();
////
////			if(name.contains(string) || type.contains(string) || place.contains(string)) {
////				prods.add(p);
////			}
////		}
//
////		List<Product> prods = products.stream()
////				.filter(p->p.getName().toLowerCase().contains(str)
////						|| p.getType().toLowerCase().contains(str)
////						|| p.getPlace().toLowerCase().contains(str))
////				.toList();
////
////		return prods;
////	}
//
//	public List<Product> getProductByPlace(String place) {
//		List<Product> prod = new ArrayList<>();
//		String placeLowerCase = place.toLowerCase();
//		for(Product p: products) {
//			if(p.getPlace().toLowerCase().contains(placeLowerCase)) {
//
//				prod.add(p);
//			}
//		}
//		return prod;
//	}
//
//	public List<Product> getProductWithOutOfWarranty(int year) {
//		List<Product> prod = new ArrayList<>();
//
//		for(Product p: products) {
//			if(p.getWarranty()<year) {
//				prod.add(p);
//			}
//		}
//
//		return prod;
//	}

}
