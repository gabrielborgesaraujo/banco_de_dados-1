/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estante.classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Flavia
 */
public class Artigo {
    private String titulo;
    private List<Autor> autores;
    private List<String> palavrasChave;

    public Artigo() {
        this.titulo = new String();
        this.autores = new ArrayList<>();
        this.palavrasChave = new ArrayList<>();
    }

    public Artigo(String titulo, List<Autor> autores, List<String> palavrasChave) {
        this.titulo = titulo;
        this.autores = autores;
        this.palavrasChave = palavrasChave;
    }

    public List<String> getPalavrasChave() {
        return palavrasChave;
    }

    public void setPalavrasChave(List<String> palavrasChave) {
        this.palavrasChave = palavrasChave;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    @Override
    public String toString() {
        return "Artigo{" + "titulo=" + titulo + ", autores=" + autores + ", palavrasChave=" + palavrasChave + '}';
    }    

    public Object getPalavrasChaves() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
