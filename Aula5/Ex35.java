package com.mycompany.mavenproject1.Aulas.Aula5;
import java.util.Scanner;
import java.math.*;
public class Ex35 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número para verificar se ele é primo");
        float num = reader.nextFloat();
        float raizq = (float) Math.sqrt(num);
        int cont = 0;
        for(int i = 1; i<=raizq; i++){
            if(num%i==0) cont++;
            if(cont>1) break;
        }
        if(cont>1) System.out.println("Esse número não é primo");
        else System.out.println("Esse número é primo");

    }
}
