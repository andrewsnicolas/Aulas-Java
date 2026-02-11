package com.mycompany.mavenproject1.Aulas.Aula4;

public class aula4 {
    public static void main(String args[]){
        int a = 1;
        int b = 2;
        boolean result = a<b;
        System.out.println(result);

        int x = 4;
        int y = 5;
        result = a>b && x<y;
        System.out.println(result);

        result = a>b || x<y;
        System.out.println(result);
    }
}
