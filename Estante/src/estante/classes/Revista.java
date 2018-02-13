/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estante.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Flavia
 */
public class Revista {
    private String nome;
    private String manchete;
    private int edicao;
    private Editora editora;
    private String editorial;
    private LocalDate data;
    private List<Artigo> artigos;

    public Revista() {
        this.nome = new String();
        this.manchete = new String();
        //this.edicao = 0;
        this.editora = new Editora();
        this.editorial = new String();
        this.data = LocalDate.of(2018, 1, 1);
        this.artigos = new ArrayList<>();
    }

    public Revista(String nome, String manchete, int edicao, Editora editora, String editorial, LocalDate data, List<Artigo> artigos) {
        this.nome = nome;
        this.manchete = manchete;
        this.edicao = edicao;
        this.editora = editora;
        this.editorial = editorial;
        this.data = data;
        this.artigos = artigos;
    }

    public List<Artigo> getArtigos() {
        return artigos;
    }

    public void setArtigos(List<Artigo> artigos) {
        this.artigos = artigos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getManchete() {
        return manchete;
    }

    public void setManchete(String manchete) {
        this.manchete = manchete;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Revista{" + "nome=" + nome + ", manchete=" + manchete + ", edicao=" + edicao + ", editora=" + editora + ", editorial=" + editorial + ", data=" + data + ", artigos=" + artigos + '}';
    }
}
