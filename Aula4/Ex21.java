package com.mycompany.mavenproject1.Aulas.Aula4;
import java.util.Scanner;
public class Ex21 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número");
        int num1 = reader.nextInt();
        System.out.println("Digite outro número");
        int num2 = reader.nextInt();
        reader.close();
        if(num1 > num2)
            System.out.printf("O 1° número digitado (%d) é maior que o 2° (%d)", num1, num2);
        else if (num1 == num2)
            System.out.printf("Os 2 números, %d e %d são iguais", num1, num2);
        else
            System.out.printf("O 1° número (%d) é menor que o 2° (%d)", num1, num2);

    }
}

