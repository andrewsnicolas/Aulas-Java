package com.mycompany.mavenproject1.Aulas.Aula4;

public class aula4_2 {
    public static void main(String args[]){
        int n = 4;
        int result = 0;
        //Maneira mais difícil
        /*
        if(n%2==0)
            result = 10;
        else
            result = 20;
         */

        //Jeito mais fácil
        result = n%2==0? 10:20;

        System.out.println(result);
    }
}
