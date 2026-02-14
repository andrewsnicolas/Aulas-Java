package com.mycompany.mavenproject1.Aulas.Aula5;
import java.util.Scanner;
public class Aula5_2 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        String senha = "abcd1234";
        String texto = "";
        int tent = 0;
        do{
            tent++;
            if(tent==4) {
                System.out.println("Você não pode entrar no sistema. Número de tentativas excedido.");
                break;
            }
            else{
                System.out.println("Digite a senha para entrar");
                texto = reader.next();
            }
        } while (!texto.equals(senha));
        if(tent<4) System.out.println("Você entrou no sistema!");
    }
}
