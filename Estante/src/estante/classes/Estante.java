/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estante.classes;

import estante.classes.Artigo;
import estante.classes.Autor;
import estante.classes.Editora;
import estante.classes.Revista;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import estante.persistencia.Persistencia;

/**
 *
 * @author Flavia
 */
public class Estante {
    private int totalDeRevistas;
    private List<Revista> revitas;

    public Estante() {
        //this.totalDeRevistas = 0;
        this.revitas = new ArrayList<>();
    }

    public Estante(int totalDeRevistas, List<Revista> revitas) {
        this.totalDeRevistas = totalDeRevistas;
        this.revitas = revitas;
    }

    public List<Revista> getRevitas() {
        return revitas;
    }

    public void setRevitas(List<Revista> revitas) {
        this.revitas = revitas;
    }

    public int getTotalDeRevistas() {
        return totalDeRevistas;
    }

    public void setTotalDeRevistas(int totalDeRevistas) {
        this.totalDeRevistas = totalDeRevistas;
    }

    @Override
    public String toString() {
        return "Estante{" + "totalDeRevistas=" + totalDeRevistas + ", revitas=" + revitas + '}';
    }
    
    public Revista novaRevista(){
        /*String nomeRevista, 
            int numEdicao, 
            LocalDate data, 
            Editora editora, 
            String manchete, 
            String linhaEditorial, 
            ArrayList<Artigo> artigos){*/
        
        //TODO code application logic here
        Scanner ler = new Scanner(System.in);
        String nomeRevista, manchete, nomeEditora, linhaEditorial, titulo, palavra, autor;
        int numEdicao, dia, mes, ano;
        
        Revista revista;
        
        System.out.printf("Informe o nome da revista:\n");
        nomeRevista = ler.nextLine();
        System.out.printf("Informe a manchete da revista:\n");
        manchete = ler.nextLine();
        System.out.printf("Informe o dia da publicação:\n");
        dia = ler.nextInt();ler.nextLine();
        System.out.printf("Informe o mês da publicação:\n");
        mes = ler.nextInt();ler.nextLine();
        System.out.printf("Informe o ano da publicação:\n");
        ano = ler.nextInt();ler.nextLine();
        System.out.printf("Informe o número da edição:\n");
        numEdicao = ler.nextInt(); ler.nextLine();
        System.out.printf("Informe o nome da editora:\n");
        nomeEditora = ler.nextLine();
        System.out.printf("Informe linha editorial:\n");
        linhaEditorial = ler.nextLine();
        List<Artigo> artigos = new ArrayList<>();
        System.out.printf("Inserir artigo? (S - para confirmar)");
        while(ler.nextLine().toUpperCase().charAt(0) == 'S') {    
            Artigo artigo = new Artigo();
            System.out.printf("Informe o título do dartigo:\n");
            artigo.setTitulo(ler.nextLine());
            System.out.printf("Informe as palavras-chave do artigo:\n");
            while(!(palavra = ler.nextLine()).isEmpty()){ artigo.getPalavrasChave().add(palavra); }
            System.out.printf("Informe os nomes dos autores do artigo:\n");
            while(!(autor = ler.nextLine()).isEmpty()){ artigo.getAutores().add(new Autor(autor)); }
            artigos.add(artigo);
            System.out.printf("Inserir artigo? (S - para confirmar)");
        }
        
        revista = new Revista(nomeRevista,
            manchete,
            numEdicao,
            new Editora(nomeEditora),
            linhaEditorial,
            LocalDate.of(ano, mes, dia),
            artigos);
        return revista;
    }
    //A misteriosa execução do ex-vice-prefeito do PT que delatou seus comparsas na investigação do escândalo de corrupção na Petrobras
    //Thiago Bronzatto
    //Cai desaprovação a candidatos ao Palácio do Planalto, exceto Lula
    //Estadão Conteúdo
    
    /**
     * Funções básicas de persistência
     */
    
    public void adicionarRevistaAEstante(String nomeRevista,
            String manchete,
            int numEdicao,
            Editora editora,
            String linhaEditorial,
            LocalDate data,
            List<Artigo> artigos){
        Revista novaRevista = new Revista(nomeRevista,
                                        manchete,
                                        numEdicao,
                                        editora,
                                        linhaEditorial,
                                        data,
                                        artigos);
        Persistencia persistencia = new Persistencia();
        this.revitas.add(novaRevista);
        this.totalDeRevistas++;
        persistencia.gravacaoESerializacaoDaInstancia(this, "src\\estante\\persistencia\\estante.json");
    }
    
    public void removerRevistaDaEstante(){
        
    }
    
    public void editarRevistaDaEstante(){
        
    }
    
    public void recuperarRevistaDaEstante(){
        
    }
}
