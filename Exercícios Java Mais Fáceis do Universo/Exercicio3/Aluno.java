package Exercicio3;

/**
 * Created by alunos3 on 16/10/14.
 */
public class Aluno {
    private double p1, p2, p3, p4;

    public Aluno(double p1, double p2, double p3, double p4){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        this.p4=p4;
    }

    public double media(){
        return (p1 + p2 + p3 + p4)/4;

    }

    public double getP1(){
        return p1;
    }

    public double getP2(){
        return p2;
    }

    public double getP3(){
        return p3;
    }

    public double getP4(){
        return p4;
    }
}
