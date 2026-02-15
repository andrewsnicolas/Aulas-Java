package com.mycompany.mavenproject1.Aulas.Aula5;
import java.util.Scanner;
public class Ex31 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = reader.nextInt();
        int ac = 0;
        for(int c = 1; c<=num; c++) {
            if (c % 2 == 0 && c % 4 != 0) ac += c;
        }
        System.out.println(ac);
    }
}
