package com.mycompany.mavenproject1.Aulas.Aula2;
import java.util.Scanner;

public class Ex07 {
    public static void main(String a[]){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a distância em metros");
        float metro = leitor.nextFloat();
        System.out.println("Digite o tempo em segundos");
        float segundos = leitor.nextFloat();
        float velocidade = metro/segundos;

        System.out.printf("A velocidade conforme os dados que você digitou é:\n " +
                "%.2fm/s \n %.2fkm/h \n %.2fmph", velocidade, (velocidade*3.6), (velocidade*2.24));

    }
}
