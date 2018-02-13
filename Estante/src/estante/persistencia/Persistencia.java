/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estante.persistencia;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import estante.classes.Estante;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Flavia
 */
public class Persistencia {
    public void gravacaoESerializacaoDaInstancia(Object instancia, String path){
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            bw.write(gson.toJson(instancia));
            bw.flush();
            System.out.println("O arquivo estante.json foi atualizado!");
        } catch (IOException ex) {
            ex.getStackTrace();
        }
    }
    
    public Estante leituraEDeserializaDaInstancia(String path){
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(path));
            System.out.println("Leitura realidada!");
        } catch (IOException ex) {
            ex.getStackTrace();
        }
        return gson.fromJson(br, Estante.class);
    }
}
