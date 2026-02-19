package com.mycompany.mavenproject1.Aulas.Aula7;

public class aula7_1 {
    public static void main(String args[]){
        int num1[] = {3,4,8};
        System.out.println(num1[0]);
        for(int i:num1){
            System.out.println(i);
        }

        int num2[] = new int[4];
        for(int i = 0; i<3; i++) {
            num2[i] = i;
            System.out.println(num2[i]);
        }
    }
}
