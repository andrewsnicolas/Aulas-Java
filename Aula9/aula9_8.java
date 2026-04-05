package Aulas.Aula9;
//Polimorfismo
class Pagamento{
    void pagar(){
        System.out.println("A forma de pagamento é genérica");
    }
}

class Cartao extends Pagamento{
    void pagar(){
        System.out.println("A forma de pagamento é cartão");
    }
}
class Pix extends Pagamento{
    void pagar(){
        System.out.println("A forma de pagamento é pix");
    }
}
public class aula9_8 {
    public static void main(String args[]){
        Pagamento p1 = new Pagamento();
        p1.pagar();
        Cartao p2 = new Cartao();
        p2.pagar();
        Pix p3 = new Pix();
        p3.pagar();
        Pagamento p4 = new Cartao();
        p4.pagar();
    }
}
