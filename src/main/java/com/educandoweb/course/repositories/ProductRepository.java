package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Product;

// Não é necessário ter anotação @Repository, pois JpaRepository ja possui
public interface ProductRepository extends JpaRepository<Product, Long>{
}
