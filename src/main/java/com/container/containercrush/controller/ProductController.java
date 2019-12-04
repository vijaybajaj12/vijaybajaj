package com.container.containercrush.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.container.containercrush.entity.ProductStyle;
import com.container.containercrush.entity.Test;
import com.container.containercrush.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/findProductById/{idStr}")
	public List<Test> findProductById(@PathVariable String idStr) {
		System.out.println("inside findProductById");
		int id = Integer.parseInt(idStr);
		return productService.findProductById(1);
	}
	
	@GetMapping("/findProductStyleByItemNumber/{itemNumStr}")
	public List<ProductStyle> findProductStyleByItemNumber(@PathVariable String itemNumStr) {
		System.out.println("inside findProductStyleByItemNumber");
		int itemNumber = Integer.parseInt(itemNumStr);
		return productService.findProductStyleByItemNumber(itemNumber);
	}

}
