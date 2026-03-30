package Aulas.Aula9;
class classe_pai{
    public classe_pai(){
        System.out.println("O pai foi chamado");
    }
    /*
    Quando criamos um método com o mesmo nome da classe e sem tipagem, ele chamado de construtor
    Ele sempre executará quando a classe for instanciada
     */
    public classe_pai(int i){
        //Uma única classe pode ter vários construtores
        System.out.println("Em int da classe pai");
    }
}
class classe_filho extends classe_pai{
    public classe_filho(){
        System.out.println("O filho foi chamado");
    }
    public classe_filho(int i){
        //Uma única classe pode ter vários construtores
        System.out.println("Em int da classe filho");
    }
}
public class aula9_2 {
    public static void main(String args[]){
        classe_pai pai = new classe_pai(10);
        System.out.println("************************************************************************");
        classe_filho filho = new classe_filho(20);
    }
}
