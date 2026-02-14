package com.mycompany.mavenproject1.Aulas.Aula4;
import java.util.Scanner;
public class Ex29 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um ano aleatório");
        int ano = reader.nextInt();
        reader.close();
        if(ano%4==0 && ano%100!=0) System.out.println("Esse ano é bissexto");
        else System.out.println("Esse ano não é bissexto");
    }
}
