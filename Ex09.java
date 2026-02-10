package com.mycompany.mavenproject1.Aula2;
import java.util.Scanner;
import java.lang.Math.*;
public class Ex09 {
    public static void main(String a[]){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor");
        int num1 = leitor.nextInt();
        System.out.println("Digite outro valor");
        int num2 = leitor.nextInt();
        float div = num2/num1;
        System.out.printf("A soma é %d" +
                "\nA diferença é %d" +
                "\nO produto é %d" +
                "\nA divisão é %.2f" +
                "\nA distância é %d" +
                "\nO maior é %d" +
                "\nO menor é %d",
                (num1+num2), (num2-num1), (num1*num2), div, (Math.abs(num1-num2)),
                (Math.max(num1, num2)), (Math.min(num1, num2)));
    }
}
