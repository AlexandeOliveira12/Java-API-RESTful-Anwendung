package com.senai.apirestful.model;

public class Produto {
    private Long id;

    private String nome;

    private Integer quantidade;

    private Double valor;

    private String observacao;

    public Produto() {}

    public Produto(String observacao, Double valor, Integer quantidade, Long id, String nome) {
        this.observacao = observacao;
        this.valor = valor;
        this.quantidade = quantidade;
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


