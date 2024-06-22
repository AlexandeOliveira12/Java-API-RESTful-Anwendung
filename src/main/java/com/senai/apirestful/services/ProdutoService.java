package com.senai.apirestful.services;

import com.senai.apirestful.model.Produto;
import com.senai.apirestful.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> obterTodos() {
        return produtoRepository.obterTodos();
    }

    public Produto adicionar(Produto produto) {
        produto.setId(null);

        produtoRepository.adicionar(produto);

        return produto;
    }
}
