package com.raulcoast.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raulcoast.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
