package Aulas.Aula6;
import java.util.Scanner;
public class Ex52 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] vetor = new String[10];
        do
        {
            System.out.println("Digite os valores (limite 10): ");
            vetor = reader.nextLine().split(" ");
        } while(vetor[0] =="");
        System.out.println("Digite o valor que deseja procurar");
        int procurar = reader.nextInt();
        int retorno = buscar(vetor, procurar);
        System.out.println("A primeira vez que ele aparece no vetor é "+retorno);
    }
    static int buscar(String[] vetor, int valor){
        int pos=-1, c = 0;
        boolean vrf = true;
        do{
            if(Integer.parseInt(vetor[c]) == valor) {
                pos = c;
                vrf = false;
            }
            c++;
        } while(c<vetor.length && vrf);
        return pos;
    }
}
