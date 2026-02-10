package com.mycompany.mavenproject1.Aulas.Aula2;
import java.util.Scanner;
public class Ex03 {
    public static void main(String a[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = reader.nextInt();
        reader.close();
        int s1 = num/1000;
        int s2 = (num/100) - (s1*10);
        int s3 = (num/10) - (s1*100) - (s2*10);
        int s4 = num - (s1*1000) - (s2*100) - (s3*10);
        int total = s1+s2+s3+s4;
        System.out.print("\nA soma dos números é igual a: "+ total);
    }
}
