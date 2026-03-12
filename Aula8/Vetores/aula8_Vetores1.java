package com.mycompany.mavenproject1.Aulas.Aula8.Vetores;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class aula8_Vetores1 {
    public static void main(String args[]){
        String[] frutasDisponiveis = {"maçã", "banana", "pera", "laranja", "mexerica", "uva"};
        String[] frutasCompradas = new String[6];
        int[] quantidadeFrutas = new int[6];
        Scanner reader = new Scanner(System.in);
        System.out.println("As frutas disponíveis nessa barraca de feira são: "+ Arrays.toString(frutasDisponiveis));
        int i, cont = -1;
        boolean vrf = true;
        do {
            cont++;
            do {
                System.out.println("Digite o índice da fruta que você quer");
                i = reader.nextInt();
            } while(i<0);
            frutasCompradas[cont] = frutasDisponiveis[i];
            do {
                System.out.printf("Quantas "+frutasCompradas[cont]+" você quer?");
                i = reader.nextInt();
            } while(i<=0);
            quantidadeFrutas[cont] = i;
            do {
                System.out.println("Você quer adicionar mais uma fruta? \n[0]Não\n[1]Sim");
                i = reader.nextInt();
            } while(i<0 || i>1);
            if(i==0) vrf=false;
        }while(vrf);
        System.out.println("Você comprou: ");
        for(int c = 0; c<= frutasCompradas.length; c++) {
            if(quantidadeFrutas[c] == 0) break;
            System.out.println(quantidadeFrutas[c]+" "+frutasCompradas[c]);
        }
    }
}
