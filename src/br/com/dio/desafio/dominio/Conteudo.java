package br.com.dio.desafio.dominio;

import br.com.dio.desafio.dominio.enums.Categoria;
import br.com.dio.desafio.dominio.enums.Nivel;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;
    private Categoria categoria;
    private Nivel nivel;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }
}
