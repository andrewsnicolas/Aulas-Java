package com.mycompany.mavenproject1.Aulas.Aula5;
import java.util.Scanner;
public class Ex36 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número");
        int ent = reader.nextInt();
        int cont = 1;
        int i = 1;
        int ac = 0;
        do{
            i*=10;
            ac+= ((ent%i)-ac)/cont;
            cont*=10;
        } while((ent/i)>=1);
        System.out.println(ac);
    }
}
