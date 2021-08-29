package com.simplestore.myfirststore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplestore.myfirststore.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
