package aula03;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Atributos da caneta");
        System.out.println("");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada: " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não posso rabiscar");
        } else {
            System.out.println("Rabiscando");
        }
    }

    public void tampar() {
        //this é uma referência ao objeto que chamou
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}