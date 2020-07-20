package jus.tjdft.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import jus.tjdft.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
