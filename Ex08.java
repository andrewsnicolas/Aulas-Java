package com.mycompany.mavenproject1.Aula2;
import java.util.Scanner;
import java.lang.Math.*;
public class Ex08 {
    public static void main(String a[]){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = leitor.nextInt();
        leitor.close();
        int quadr = (int) (Math.pow(num,2));

        System.out.printf("O %d elevado ao quadrado é %d, elevado ao cubo é %d, " +
                "e elevado a quarta é %d", num, quadr, (quadr*num),
                (quadr*quadr));
    }
}
