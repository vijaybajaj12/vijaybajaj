package com.container.containercrush.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.container.containercrush.entity.ProductStyle;
import com.container.containercrush.entity.Test;
import com.container.containercrush.repository.ProductStyleRespository;
import com.container.containercrush.repository.TestRespository;


@Service
public class ProductService {
	
	@Autowired
	TestRespository testRespository;
	
	@Autowired
	ProductStyleRespository productStyleRespository;
	
	public List<Test> findProductById(int id) {
		
		return testRespository.findProductById(id);
	}
	
	public List<ProductStyle> findProductStyleByItemNumber(int itemNumber) {
		
		return productStyleRespository.findProductStyleByItemNumber(itemNumber);
	}

}
