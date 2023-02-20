package br.com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
}