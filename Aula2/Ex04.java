package com.mycompany.mavenproject1.Aulas.Aula2;
import java.util.Scanner;
public class Ex04 {
    public static void main(String a[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o número em minutos");
        float min = reader.nextInt();
        reader.close();
        float ano = (float) (min / 525600);
        float mes = (float) (min / 43800);
        System.out.println("O valor digitado em ano é: "+ano);
        System.out.println("O valor digitado em mês é: "+mes);
    }
}
