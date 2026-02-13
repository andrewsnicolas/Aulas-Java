package com.mycompany.mavenproject1.Aulas.Aula4;
import java.util.Scanner;
public class Ex18 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número para verificar se ele é ímpar ou par");
        int num = reader.nextInt();
        reader.close();
        if(num%2==0) System.out.println("Esse número é par");
        else System.out.println("Esse número é ímpar");
    }
}
