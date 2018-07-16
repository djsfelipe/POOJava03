package aula03;

public class Aula03 {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        //Ponta é privado, logo não posso mexer em outra classe
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //Tampada é privado
        //c1.tampada = true;
        c1.tampar();        
        c1.status();
        c1.rabiscar();
    }
}
