package com.mycompany.mavenproject1.Aulas.Aula6;
import java.util.Scanner;

class classe_metodos{
//Pela linguagem java ser estritamente orientada a objetos, é impossível criar métodos fora de objetos
    public void tocar(String instrumento){
        System.out.printf("O %s está sendo tocado agora...", instrumento);
    }

    public float comprar(String produto, float preco, float dinheiro) {
        if (preco < dinheiro) return dinheiro - preco;
        else {
            System.out.printf("Não foi possível comprar o %s, o dinheiro foi insuficiente", produto);
            return dinheiro;
        }
    }
}

public class aula6_2 {

    public static void main(String args[]){
        classe_metodos obj = new classe_metodos();
        obj.tocar("violão");
        float troco = obj.comprar("leite", 5.00F, 7.00F);
        troco = obj.comprar("chocolate", 9.00F, troco);
    }
}
