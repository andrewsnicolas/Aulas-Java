package com.mycompany.mavenproject1.Aulas;
import java.util.Scanner;

public class Ex06 {
    public static void main(String a[]){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu peso");
        float peso = leitor.nextFloat();

        System.out.println("Digite a sua altura em metros");
        float altura = leitor.nextFloat();

        leitor.close();

        float divisor = (float) Math.pow(altura,2);
        float imc = peso/divisor;

        System.out.printf("O seu índice de massa corporal é : %.2f", imc);

    }
}
