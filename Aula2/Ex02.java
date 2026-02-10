package com.mycompany.mavenproject1.Aulas.Aula2;
import java.util.Scanner;
public class Ex02 {
    public static void main(String a[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite uma medida de distância em polegadas");
        float pin = reader.nextFloat();
        reader.close();
        float met = (float) (pin*0.0254);
        System.out.printf("\n A medida digitada em metros é igual a %.4fm", met);
    }
}
