package com.mycompany.mavenproject1.Aulas.Aula4;
import java.util.Scanner;
public class Ex26 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um dos lados do triângulo");
        float lado1 = reader.nextFloat();
        System.out.println("Digite um outro dos lados do triângulo");
        float lado2 = reader.nextFloat();
        System.out.println("Digite o último lado do triângulo");
        float lado3 = reader.nextFloat();
        boolean verif = lado1<(lado2+lado3) && lado2<(lado1+lado3) && lado3<(lado1+lado2);
        if(verif) System.out.println("Esse é um verdadeiro triângulo");
        else System.out.println("Esse não é um verdadeiro triângulo");
    }
}
