package Exercicio6;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

/**
 * Created by alunos3 on 16/10/14.
 */
public class App {

    public static void main(String[] args) {

        ArrayList<Double> notas = new ArrayList<Double>();
        notas.add(2.5);
        notas.add(5.0);
        notas.add(2.0);
        notas.add(4.0);
        notas.add(8.5);
        notas.add(7.0);

        Atleta atleta1 = new Atleta (notas);

        System.out.println(atleta1.maiorNota());
        System.out.println(atleta1.menorNota());
        System.out.println(atleta1.media());
        System.out.println(atleta1.notasAbaixoDe6());
    }
}
