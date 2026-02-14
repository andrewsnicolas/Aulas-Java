package com.mycompany.mavenproject1.Aulas.Aula4;
import java.util.Scanner;
public class Ex27 {
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o dia da semana");
        int dia_semana = reader.nextInt();
        String texto;
        switch(dia_semana){
            case 1:
                texto = "domingo";
                break;
            case 2:
                texto = "segunda-feira";
                break;
            case 3:
                texto = "terça-feira";
                break;
            case 4:
                texto = "quarta-feira";
                break;
            case 5:
                texto = "quinta-feira";
                break;
            case 6:
                texto = "sexta-feira";
                break;
            case 7:
                texto = "sábado";
                break;
            default:
                texto = "";
                break;
        }
        if(!texto.isBlank()) System.out.printf("Hoje é %s", texto);
        else System.out.println("Número para data inválida");
    }
}
