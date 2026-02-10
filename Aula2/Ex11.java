package com.mycompany.mavenproject1.Aulas.Aula2;
import java.math.BigInteger;
import java.util.Scanner;
public class Ex11 {
    public static void main(String a[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número");
        int num1 = reader.nextInt();
        System.out.println("Digite outro número");
        int num2 = reader.nextInt();
        reader.close();
        int res1 = num1*num2;
        BigInteger bg1 = BigInteger.valueOf(num1);
        BigInteger bg2 = BigInteger.valueOf(num2);
        BigInteger res2 = BigInteger.valueOf(num2);

        System.out.println(res1);
        System.out.println(res2);
        //Deu negativo? Overflow
    }
}
