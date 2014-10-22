package Exercicio1;

/**
 * Created by alunos3 on 16/10/14.
 */
public class App {

    public static void main(String[] args){

        Elevador meuElevador = new Elevador();

        meuElevador.sobe();
        meuElevador.sobe();
        System.out.println(meuElevador.getAndar());
        meuElevador.sobe();
        meuElevador.desce();
        System.out.println(meuElevador.getAndar());





    }

}
