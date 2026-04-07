package Aulas.Aula9;
import java.util.Scanner;
enum Celulares{
    PocoF8(5000), Iphone17(17000), SamsungS25(10000),
    Signature(8000), GT7Pro(6000), Nokia;
    private int preco;
    private Celulares(){
        preco = 500;
        //Você pode deixar essa classe sem nada, na verdade
    }
    private Celulares(int preco){
        this.preco = preco;
    }
    public int getPreco(){
        return preco;
    }
    public void setPreco(int newpreco){
        this.preco = newpreco;
    }
}
public class aula9_13 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        String answUser = "S";
        Celulares[] opcoes = Celulares.values();
        do{
            answUser = "S";
            System.out.println("Deseja comprar um celular?\n[S] ou [N]?");
            answUser = reader.next();
            if(answUser.equalsIgnoreCase("N")) break;
            System.out.println("\nAs opções disponíveis são: ");
            for(Celulares i : opcoes) System.out.print(i + " ");
            System.out.print("\nDigite o índice do celular que deseja comprar: ");
            int ind = reader.nextInt();
            ind--;
            Celulares celChose = Celulares.values()[ind];
            System.out.printf("O Celular escolhido foi o %s, ele custa: R$%d,00", celChose, celChose.getPreco());
            System.out.println("\nVocê quer comprar esse celular?[S] ou [N]?");
            answUser = reader.next();
        } while(answUser.equalsIgnoreCase("N"));
        if(answUser.equalsIgnoreCase("N")) System.out.println("Tá bom! Volte quando quiser!");
        else System.out.println("Celular comprado!");
    }
}
