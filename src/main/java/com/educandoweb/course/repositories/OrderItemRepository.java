package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.entities.pl.OrderItemPK;

// Não é necessário ter anotação @Repository, pois JpaRepository ja possui
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
}
