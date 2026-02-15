package com.mycompany.mavenproject1.Aulas.Aula5;
import java.util.Scanner;
public class Ex32 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int c=-1, dig=0;
        float ac = 0;
        do{
            c++;
            System.out.println("Digite um número");
            dig = reader.nextInt();
            ac+=dig;
        } while(dig != 0);
        System.out.printf("A média dos números digitados é %.2f", (ac/c));
        System.out.printf("A quantidade de valores digitados é %d", c);
    }
}
