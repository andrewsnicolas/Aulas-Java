package com.mycompany.mavenproject1.Aulas.Aula6;
import java.util.Scanner;

    class Calculadora{
        public int somar(int x, int y){
            return x+y;
        }
    }

public class aula6_1 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número");
        int num1 = reader.nextInt();
        System.out.println("Digire outro número");
        int num2 = reader.nextInt();

        Calculadora calc = new Calculadora();
        int result = calc.somar(num1, num2);

        System.out.printf("O resultado de %d + %d é %d", num1, num2, result);
    }
}
