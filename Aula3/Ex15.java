package com.mycompany.mavenproject1.Aulas.Aula3;
import java.util.Scanner;
public class Ex15 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite a base do triângulo");
        float base = reader.nextInt();
        System.out.println("Digite a altura do triângulo");
        float altura = reader.nextInt();
        reader.close();
        float area = (base*altura)/2;
        System.out.printf("A área do triângulo é %.2f", area);
    }
}
