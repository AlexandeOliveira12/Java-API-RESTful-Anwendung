package com.senai.apirestful.repository;

import com.senai.apirestful.model.Produto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Optional;

@Repository
public class ProdutoRepository {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private Long ultimoId = 0L;

    public List<Produto> obterTodos() {
        return produtos;
    }

    public Optional<Produto> obterPorId(Long id) {
        return produtos.stream()
                .filter(produto -> produto.getId() == id)
                .findFirst();
    }

    public Produto adicionar(Produto produto) {
        ultimoId++;

        produto.setId(ultimoId);
        produtos.add(produto);

        return produto;
    }

    public String deletar(Long id ) {
        Optional<Produto> prod = obterPorId(id);
        if (prod.isEmpty()) {
            return "Produto com id:" + id + " Não foi possivel a sua exclusão!";
        }
        else {
            produtos.removeIf(produto -> produto.getId() == id);
            return "Produto com id: " + id + " Excluido com sucesso!";
        }
    }

}
