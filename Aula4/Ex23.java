package com.mycompany.mavenproject1.Aulas.Aula4;
import java.util.Scanner;
public class Ex23 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite a temperatura");
        float temp = reader.nextFloat();
        reader.close();
        if(temp<15) System.out.println("Está frio");
        else if(temp>=15 && temp<=25) System.out.println("A temperatura está agradável");
        else System.out.println("Está quente");
    }
}
