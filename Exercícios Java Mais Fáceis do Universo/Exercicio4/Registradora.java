package Exercicio4;

/**
 * Created by alunos3 on 16/10/14.
 */
public class Registradora {
    private double totalConta;

    public Registradora(){
        this.totalConta=0;
    }

    public double getTotalConta(){
        return totalConta;
    }

    public void compra(double valor){
        totalConta += valor;
    }

    public double comTaxa(){
        totalConta = totalConta + (totalConta * 0.1);
        return totalConta;
    }

    public double semTaxa(){
        return totalConta;
    }

    public double troco(double valorPago){
        double troco;
        return troco = valorPago - totalConta;
    }

}
