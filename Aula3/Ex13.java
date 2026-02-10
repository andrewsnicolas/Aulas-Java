package com.mycompany.mavenproject1.Aulas.Aula3;
import java.util.Scanner;
public class Ex13 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número");
        int n1 = reader.nextInt();
        System.out.println("Digite outro número");
        int n2 = reader.nextInt();
        int s = n1+n2;
        System.out.printf("A soma dos números digitados é %d", s);
    }
}
