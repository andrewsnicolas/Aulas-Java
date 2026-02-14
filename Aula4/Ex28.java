package com.mycompany.mavenproject1.Aulas.Aula4;
import java.util.Scanner;
import java.math.*;
public class Ex28 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        int a = reader.nextInt();
        System.out.println("Digite o valor de B");
        int b = reader.nextInt();
        System.out.println("Digite o valor de C");
        int c = reader.nextInt();
        if (a == 0) System.out.println("A equação não é de 2° grau");
        else {
            int delta = (int) ((Math.pow(b, 2)) - 4 * a * c);
            if (delta > 0) System.out.println("Essa equação tem 2 raízes reais distintas");
            else if (delta == 0) System.out.println("Essa equação tem uma raiz real");
            else System.out.println("Essa equação não possui raiz real");
        }
    }
}