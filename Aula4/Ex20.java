package com.mycompany.mavenproject1.Aulas.Aula4;
import java.util.Scanner;
public class Ex20 {
    public static void main() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite a sua idade");
        int idade = reader.nextInt();
        reader.close();
        if (idade>=18) System.out.println("Você é maior de idade");
        else System.out.println("Você é menor de idade");
    }
}
