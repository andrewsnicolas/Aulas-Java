package com.mycompany.mavenproject1.Aulas.Aula5;
import java.util.Scanner;
public class Ex37 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número");
        String ent = reader.next();
        int c = ent.length() - 1;
        reader.close();
        int i = 0;
        boolean verif = false;
        for (i = 0; i < ent.length(); i++) {
            if (ent.charAt(i) != ent.charAt(c)) {
                verif = true;
                break;
            }
            c--;
        }
        if (verif) System.out.println("Não é palíndromo");
        else System.out.println("É palíndromo");
    }
}
