package com.mycompany.mavenproject1.Aulas.Aula4;
import java.util.Scanner;
public class Ex25 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o valor da compra");
        float valCom = reader.nextFloat();
        float descon;
        if(valCom<=100) descon = 0;
        else if(valCom>100 && valCom<=500) descon = 0.10F;
        else descon = 0.20F;
        System.out.printf("A compra de R$%.2f teve desconto de %.0f%%, assim," +
                "teve o valor total de R$%.2f", valCom, (descon*100), (valCom-(valCom*descon)));
    }
}
