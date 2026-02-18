package com.mycompany.mavenproject1.Aulas.Aula6;
import java.util.Scanner;

class metodos{
    public int soma(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public int soma(int n1, int n2){
        return n1+n2;
    }
}

public class aula6_3 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número");
        int x = reader.nextInt();
        System.out.println("Digite outro número");
        int y = reader.nextInt();
        int z = 7;
        metodos aux = new metodos();
        System.out.println(aux.soma(x,y));
        System.out.println(aux.soma(x,y,z));
    }
}
