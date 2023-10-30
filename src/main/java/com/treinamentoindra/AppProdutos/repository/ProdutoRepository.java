package com.treinamentoindra.AppProdutos.repository;

import com.treinamentoindra.AppProdutos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {}
