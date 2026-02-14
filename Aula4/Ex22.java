package com.mycompany.mavenproject1.Aulas.Aula4;
import java.util.Scanner;
public class Ex22 {
    public static void main(String main[]) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite sua média final");
        float nota = reader.nextFloat();
        reader.close();
        if(nota>=6) System.out.println("Aprovado!");
        else System.out.println("Reprovado!");
    }
}
