package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

import com.example.dao.CategoryDao;
import com.example.domain.Category;

@SpringBootApplication
@EnableEurekaClient
public class AcountServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(AcountServiceApplication.class, args);
		CategoryDao dao= ctx.getBean(CategoryDao.class);
		Category cat1= new Category("cars");
		Category cat2= new Category("motorcyles");
		Category cat3= new Category("clothes");
		Category cat4= new Category("shoes");
		dao.save(cat1);dao.save(cat2);dao.save(cat3);dao.save(cat4);
		
	}
}
