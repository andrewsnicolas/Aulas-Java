package com.mycompany.mavenproject1.Aulas.Aula2;
import java.util.Scanner;

public class Ex01 {
    public static void main(String a[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Fahrenheit: ");
        float fah = reader.nextFloat();
        reader.close();
        float cel = (fah-32) * 5/9;
        System.out.printf("\nA temperatura digitada em celsius é: %.2f°C", cel);
    }
}
