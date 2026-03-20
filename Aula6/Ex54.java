package Aulas.Aula6;
import java.util.Scanner;
import java.util.Arrays;
public class Ex54 {
    public static void main(String args[]) {

        Scanner reader = new Scanner(System.in);
        String textoEntrada;

        do {
            System.out.println("Digite um texto para verificar se é um palíndromo");
            textoEntrada = reader.nextLine();
            /*
            O uso do nextLine garante pegar a linha inteira.
            Já o next(), para de pegar os valores no primeiro
            espaço encontrado
             */
        } while (textoEntrada == "");
        boolean ehpalindromo = ehPalindromo(textoEntrada);
        System.out.println(ehpalindromo? "É um palíndromo" : "Não é um palíndromo");
    }

    static boolean ehPalindromo(String texto) {

        boolean retorno_booleano = true;
        int posicao_oposta;
        int tamanhoTexto = texto.length();

        texto = texto.toLowerCase();

        for(int c = 0; c < tamanhoTexto/2; c++){

            posicao_oposta = texto.length()-1-c;

            if(texto.charAt(c)!= texto.charAt(posicao_oposta)){
                retorno_booleano = false;
                break;
            }
        }
        return retorno_booleano;
    }
}