package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;

// Não é necessário ter anotação @Repository, pois JpaRepository ja possui
public interface OrderRepository extends JpaRepository<Order, Long>{
}
