package com.mycompany.mavenproject1.Aulas.Aula3;
import java.util.Scanner;

public class Ex17 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o dividendo");
        int dividendo = reader.nextInt();
        System.out.println("Digite o divisor");
        int divisor = reader.nextInt();
        reader.close();
        int quo = dividendo/divisor;
        int res = dividendo%divisor;
        System.out.printf("O quoficiente é %d e o resto é %d", quo, res);
    }
}
