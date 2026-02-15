package com.mycompany.mavenproject1.Aulas.Aula5;
import java.util.Scanner;
public class Ex30 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = reader.nextInt();
        int ac = 0;
        for(int c = 1; c<=num; c++){
            if(c%3==0 || c%5==0) ac += c;
        }
        System.out.println(ac);
    }
}
