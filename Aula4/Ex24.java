package com.mycompany.mavenproject1.Aulas.Aula4;
import java.util.Scanner;
public class Ex24 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número");
        int num1 = reader.nextInt();
        System.out.println("Digite outro número");
        int num2 = reader.nextInt();
        System.out.println("Digite a operação que você quer fazer");
        String oper = reader.next();
        float s;
        switch(oper){
            case "+":
                s = num1+num2;
                System.out.printf("A soma dos valores é: %d", s);
                break;
            case "-":
                s = num1-num2;
                System.out.printf("A subtração dos valores é: %d", s);
                break;
            case "*":
                s = num1*num2;
                System.out.printf("A multiplicação dos valores é: %d", s);
                break;
            case "/":
                s = (float) (num1)/(num2);
                System.out.printf("A divisão dos valores é: %.2f", s);
                break;
            default:
                System.out.println("Operação digitada é inválida");
                break;
        }
    }
}
