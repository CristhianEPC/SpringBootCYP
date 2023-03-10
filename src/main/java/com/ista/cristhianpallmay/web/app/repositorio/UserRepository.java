package com.ista.cristhianpallmay.web.app.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ista.cristhianpallmay.web.app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
