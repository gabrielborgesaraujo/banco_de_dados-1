/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estante.classes;

/**
 *
 * @author Flavia
 */
public class Autor {
    private String nome;

    public Autor() {
        this.nome = new String();
    }
    
    public Autor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }  

    @Override
    public String toString() {
        return "Autor{" + "nome=" + nome + '}';
    }
}
