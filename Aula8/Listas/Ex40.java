package com.mycompany.mavenproject1.Aulas.Aula8.Listas;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Ex40 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        metodos_suporte adLi = new metodos_suporte();
        int func = 0;
        ArrayList<String> listaCad = new ArrayList<String>();
        String nome;
        do{
            System.out.println("O que você quer fazer? \n[0]Finalizar cadastros \n[1]Adicionar nome \n[2]Listar nomes");
            func = reader.nextInt();
            if(func==1){
                System.out.println("Digite o nome que quer adicionar");
                nome = reader.next();
                adLi.adicionarNome(listaCad, nome);
            } else if(func==2) adLi.listarNomes(listaCad);
        } while(func!=0);
    }
}
