package com.mycompany.mavenproject1.Aulas.Aula3;
import java.util.Scanner;
public class Ex16 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o tempo em minutos");
        short min = reader.nextShort();
        float hor = ((float) (min)) /60;
        System.out.printf("O tempo de %d minutos é %.2f horas", min, hor);
    }
}
