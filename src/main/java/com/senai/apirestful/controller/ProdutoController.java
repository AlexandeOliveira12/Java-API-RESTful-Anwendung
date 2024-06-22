package com.senai.apirestful.controller;

import com.senai.apirestful.model.Produto;
import com.senai.apirestful.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")

public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> obterTodos() {
        return produtoService.obterTodos();
    }

    @GetMapping("/{id}")
    public Optional<Produto> obterPorID(@PathVariable Long id) {
        return produtoService.obterPorId(id);
    }

    @PostMapping
    public Produto adicionar(@RequestBody Produto produto) {
        return produtoService.adicionar(produto);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {
        return produtoService.deletar(id);
    }

    @PutMapping("/{id}")
    public Produto atualizar(@RequestBody Produto produto, @PathVariable Long id){
        return produtoService.atualizar(id, produto);
    }
}
