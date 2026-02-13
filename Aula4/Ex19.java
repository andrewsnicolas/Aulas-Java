package com.mycompany.mavenproject1.Aulas.Aula4;
import java.util.Scanner;
public class Ex19 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é positivo ou negativo");
        int num = reader.nextInt();
        if(num>0) System.out.println("Esse número é positivo");
        else System.out.println("Esse número é negativo");
    }
}
