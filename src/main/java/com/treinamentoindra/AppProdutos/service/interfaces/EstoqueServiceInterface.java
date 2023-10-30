package com.treinamentoindra.AppProdutos.service.interfaces;

import com.treinamentoindra.AppProdutos.model.Estoque;

import java.util.List;
import java.util.Optional;

public interface EstoqueServiceInterface {
    Estoque save(Estoque estoque);
    Optional<Estoque> getById(Long id);
    List<Estoque> getAll();
    Estoque update(Estoque estoque);
    void delete(Long id);
    Estoque addQuantidade(Long id, int quantidade);
    Estoque delQuantidade(Long id, int quantidade);
}
