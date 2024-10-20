package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;

//@Repository		//opcional, pois o UserRepository já está herdando do JPARepository, que possui registro como componente do Spring

public interface OrderRepository extends JpaRepository<Order, Long>{

}
