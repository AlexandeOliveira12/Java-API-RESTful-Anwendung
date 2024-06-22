package com.senai.apirestful.services;

import com.senai.apirestful.model.Produto;
import com.senai.apirestful.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> obterTodos() {
        return produtoRepository.obterTodos();
    }

    public Optional<Produto> obterPorId(Long id) {
        return produtoRepository.obterPorId(id);
    }

    public Produto adicionar(Produto produto) {
        produto.setId(null);

        produtoRepository.adicionar(produto);

        return produto;
    }

    public String deletar(Long id) {
        return produtoRepository.deletar(id);
    }

    public Produto atualizar(Long id, Produto produto) {
        produto.setId(id);
        return produtoRepository.atualizar(produto);
    }
}