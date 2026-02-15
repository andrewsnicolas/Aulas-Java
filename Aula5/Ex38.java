package com.mycompany.mavenproject1.Aulas.Aula5;

public class Ex38 {
    public static void main(String args[]){
        float habA = 80_000F;
        float habB = 200_000F;
        int c = 0;
        do{
            c++;
            habA *= 1.03F;
            habB *= 1.015F;
        } while (habA<habB);
        System.out.println("Os anos que tomarão para ultrapassar são: "+ c+ " anos");
    }
}
