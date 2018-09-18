package com.ifal.web.amazonRL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ifal.web.amazonRL.modelo.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
