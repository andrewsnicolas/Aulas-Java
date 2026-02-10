package com.mycompany.mavenproject1.Aulas.Aula2;
import java.util.Scanner;
public class Ex12 {
    public static void main(String a[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número muito grande");
        long numL = reader.nextLong();
        int numI = (int) (numL);
        short numS = (short) (numI);
        byte numB = (byte) (numS);
        System.out.println("O valor digitado: "+ numL+ "\nO valor em int: "+numI+"" +
                "\nO valor em short: "+numS+"\nO valor em byte"+numB);
    }
}
