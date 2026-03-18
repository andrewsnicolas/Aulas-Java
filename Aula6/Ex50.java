package Aulas.Aula6;
import java.util.Scanner;
public class Ex50 {
    public static void main(String[] args) {
        String[] entrada = new String[10];
        Scanner reader = new Scanner(System.in);
        System.out.println("\nDigite os números desejados para somar (limite 10): ");
        entrada = reader.nextLine().split(" ");
        if(entrada[0] == "") entrada[0] = "0";
        System.out.println(soma(entrada));
    }
    public static int soma(String... numeros) {
        int ac = 0;
        for(String numero:numeros) ac+=Integer.parseInt(numero);
        return ac;
    }
}
