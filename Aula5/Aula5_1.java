package com.mycompany.mavenproject1.Aulas.Aula5;

public class Aula5_1 {
    public static void main(String args[]){
        int i = 0;
        /*
        while(true){ //executa infinitamente
            i++;
            System.out.println("Olá " +i);
            }
         */
        while(i<10_000_000){
            i++;
            System.out.println(i);
            if(i==4) break;
        }
    }
}
