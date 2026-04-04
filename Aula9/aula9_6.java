package Aulas.Aula9;
class Pai{
    public Pai(){
        System.out.println("\nEstou no Pai");
    }
    public Pai(int n){
        System.out.printf("\nO Pai recebeu %d do filho", n);
    }
}
class Filho extends Pai{
    public Filho(){
        super(1);
        /*
        O super é instanciado em toda classe, sendo o primeiro comando a ser executado
        na classe construtora, ele executa a classe construtora da sua classe pai
        Caso você execute ela em uma classe construtora manualmente, é possível passar
        parâmetros pra ela
         */
        System.out.print("\nEstou no filho");
    }
    public Filho(int n){
        this();
        //Executa o construtor da mesma classe (nesse caso, o filho)
        System.out.printf("\nO filho recebeu %d", n);
    }
}
public class aula9_6 {
    public static void main(){
        Filho hijo = new Filho(5);
    }
}
