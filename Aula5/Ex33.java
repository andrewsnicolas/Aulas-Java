package com.mycompany.mavenproject1.Aulas.Aula5;
import java.util.Scanner;
public class Ex33 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um número");
        int ent = reader.nextInt();
        int max = ent;
        int min = ent;
        for(int c = 2; c<=10; c++){
            System.out.println("Digite um número");
            ent = reader.nextInt();
            if(max<ent) max=ent;
            if(min>ent) min=ent;
        }
        System.out.printf("O menor valor dessa lista é %d, e o maior é %d", min, max);
        reader.close();
    }
}
