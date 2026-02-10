package com.mycompany.mavenproject1.Aulas.Aula3;
import java.util.Scanner;

public class Ex14 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número");
        double n1 = reader.nextInt();
        System.out.println("Digite outro número");
        double n2 = reader.nextInt();
        double s =(n1+n2)/2;
        System.out.printf("A média dos números digitados é %.2f", s);
    }
}
