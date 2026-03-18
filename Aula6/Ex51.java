package Aulas.Aula6;
import java.util.Scanner;
public class Ex51 {
    static int contador = 0;
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int funcao;
        do{
            do{
                System.out.println("O que você quer fazer?\n[0]Incrementar\n[1]Resetar\n[2]Mostrar contador\n[3]Sair");
                funcao = reader.nextInt();
            } while(funcao<0 || funcao>3);
            switch(funcao){
                case 2:
                    System.out.println("O valor de contador é " + contador);
                    break;
                case 1:
                    resetar();
                    break;
                case 0:
                    incrementar();
                    break;
            }
            if(funcao==3) break;
        } while(true);
        System.out.println("O valor de contador é " + contador);
    }
    static void incrementar(){
        contador++;
    }
    static void resetar(){
        contador=0;
    }
}
