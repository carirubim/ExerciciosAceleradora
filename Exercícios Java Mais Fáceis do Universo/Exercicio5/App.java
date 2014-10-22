package Exercicio5;

import java.util.Scanner;

/**
 * Created by alunos3 on 16/10/14.
 */
public class App {

    public static void main(String[] args) {

        Produto produto1 = new Produto(3, "bolacha", 3.50, 20);
        Produto produto2 = new Produto(8, "amendoim", 7.50, 11);

        System.out.println("Valor promocional: " + produto1.promocao(3, 3.50));
        System.out.println("Valor promocional: " + produto2.promocao(8, 7.50));


    }
}
