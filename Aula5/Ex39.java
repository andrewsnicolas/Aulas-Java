package com.mycompany.mavenproject1.Aulas.Aula5;
import java.util.Scanner;
import java.math.*;
public class Ex39 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int resp = 0;
        int ent = 0;
        do{
            System.out.println("Escolha: \n" +
                    "1 - Verificar primo\n" +
                    "2 - Calcular fatorial\n" +
                    "3 - Soma de múltiplos de 3\n" +
                    "4 - Sair");
            resp = reader.nextInt();
            if(resp == 1){
                System.out.println("Digite um número");
                ent = reader.nextInt();
                int cont = 0;
                int raiz = (int) (Math.sqrt(ent));
                for(int i = 1; i<=raiz; i++){ // arrumar aqui
                    if(ent%i == 0) cont++;
                    if (cont==2) break;
                }
                if(cont==2) System.out.println("Não é primo");
                else System.out.println("É primo");
            }
            else if(resp == 2){
                System.out.println("Digite um número");
                ent = reader.nextInt();
                int ac = 1;
                for(int i = ent; i>=1; i--) ac *= i;
                System.out.println("O resultado do fatorial é: "+ac);
            }
            else if(resp == 3){
                System.out.println("Digite um número");
                ent = reader.nextInt();
                int ac = 0;
                for(int i = 0; i<=ent; i++) if(i%3==0) ac +=i;
                System.out.println("A soma dá: "+ac);
            }
        } while(resp!=4);
    }
}
