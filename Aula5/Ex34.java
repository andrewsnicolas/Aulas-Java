package com.mycompany.mavenproject1.Aulas.Aula5;
import java.util.Scanner;
public class Ex34 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        float num = 1, ent = 0;
        short c=0;
            System.out.println("Digite um número");
            ent = reader.nextFloat();
        do{
            num *=10;
            c++;
        } while((ent/num)>1);
        System.out.println("Esse número tem "+c+" digitos");
    }
}
