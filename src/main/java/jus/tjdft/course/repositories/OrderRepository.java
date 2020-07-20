package jus.tjdft.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import jus.tjdft.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
