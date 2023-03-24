package br.com.spring.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.auth.domain.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long>{

	User findByUsername(String username);
	
}