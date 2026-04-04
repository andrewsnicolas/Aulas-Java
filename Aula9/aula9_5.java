package Aulas.Aula9;

class Homem{


    private int age = 0;
    private String cpf;
    String nome = "";
    char sexo;
    public Homem(){

    }
    public Homem(char sexo, String nome){
        this.sexo = sexo;
        this.nome = nome;
        //O this mostra que é o sexo e nome da instância
    }
    int getAge(){
        return age;
    }
    void setAge(int newAge){
        age = newAge;
    }
    String getCPF(){
        return cpf;
    }
    void setCPF(String newCPF){
        cpf = newCPF;
    }
}

public class aula9_5 {

    public static void main(String args[]){
        Homem hom1 = new Homem('F', "Maria");
        String sexo = hom1.sexo == 'F'? "moça" : "moço";
        System.out.printf("Olá, Maria! Você é uma %s", sexo);
    }
}
