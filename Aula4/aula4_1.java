package com.mycompany.mavenproject1.Aulas.Aula4;

public class aula4_1 {
    public static void main(String args[]){
        int x = 19;

        if(x>=18)
            System.out.println("Maior de idade");
        else
            System.out.println("Menor de idade");

        //Quando tem apenas um comando, não precisa de chaves
        /*
        if(x>=18){
            System.out.println("Maior de idade");
            }
        else
        {
            System.out.println("Menor de idade");
        }
         */

        String nome = "Nícolas";

        if(nome == "Nícolas")
            System.out.println("Olá dono do código");
        else if (nome == "Nícolle")
            System.out.println("Olá dona chata");
        else
            System.out.println("Olá desconhecido");
    }
}
