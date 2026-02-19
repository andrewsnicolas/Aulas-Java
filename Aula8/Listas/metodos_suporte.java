package com.mycompany.mavenproject1.Aulas.Aula8.Listas;
import java.util.Collections;
import java.util.ArrayList;
public class metodos_suporte {
    void adicionarNome(ArrayList<String> lista, String nome){
        boolean duplicado = !(lista.contains(nome));
        if(!(nome.isEmpty()) && duplicado) lista.add(nome);
    }
    void listarNomes(ArrayList<String> lista){
        for(int i = 0; i<lista.size(); i++){
            System.out.printf("\nO nome na posição %d, é %s",i, lista.get(i));
        }
    }
}
