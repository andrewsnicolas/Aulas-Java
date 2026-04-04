package Aulas.Aula9;
import java.util.Scanner;
class Humano{
    String nome;
    int idade;
    private String cpf = "999.999.999-99";
    private String endereco = "Rua josé fino da silva";

    public String getCPF(){
        return cpf;
    }

    public void setCPF(String newCpf){
        cpf = newCpf;
    }
    //Características privadas só podem ser acessadas por métodos públicos - fora da classe

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String newEnder){
        endereco = newEnder;
    }
}

public class aula9_4 {
    public static void main(String args[]){
        Humano human = new Humano();
        Scanner reader = new Scanner(System.in);
        human.nome = "Andrews";
        human.idade = 19;
        //human.cpf = "332993923442";
        //human.endereco = "Rua josé fino da silva";
        //propriedades privadas não podem ser acessadas diretamente pelo código
        System.out.printf("Olá, %s! Você tem %d anos, não é? Seu cpf é %s e você mora na %s", human.nome, human.idade, human.getCPF(), human.getEndereco());
        System.out.print("\nDigite o novo cpf: ");
        String ent = reader.next();
        human.setCPF(ent);
        reader.nextLine();
        System.out.println("\nDigite o novo endereço: ");
        ent = reader.nextLine();
        human.setEndereco(ent);
        System.out.printf("\nSeu endereço atual é %s e seu CPF atual é %s.", human.getEndereco(), human.getCPF());
    }
}