package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.domain.Category;

@RepositoryRestResource
public interface CategoryDao extends JpaRepository<Category	, Long> {

}
