package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.CategoryDao;
import com.example.domain.Category;

@RestController
public class CategoryController {
	@Autowired
	CategoryDao categoryDao;
	
		@RequestMapping(value="/cate", method=RequestMethod.GET)
		public List<Category> getAllcategory(){
			List<Category> categories= categoryDao.findAll();
			return categories;
			
		}
}
