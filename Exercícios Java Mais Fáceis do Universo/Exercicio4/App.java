package Exercicio4;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Created by alunos3 on 16/10/14.
 */
public class App {

    public static void main(String[] args) {

        Registradora compra = new Registradora();
        Scanner dados = new Scanner(System.in);
        int op=0;
        double valor;
        String taxa;
        double valorPago;

        System.out.println("1- Adiciona compra:");
        System.out.println("2- Finalizar.");
        op=dados.nextInt();

        while(op!=2){
            System.out.println("Valor: ");
            valor=dados.nextDouble();
            compra.compra(valor);

            System.out.println("1- Adiciona compra:");
            System.out.println("2- Finalizar.");
            op=dados.nextInt();
        }

        System.out.println("Com taxa de serviço?\nS ou N");
        taxa=dados.next();

        if (taxa.equals("S")){
            System.out.println("Valor total com taxa de serviço: R$ " + compra.comTaxa());
        } else {
            System.out.println("Valor total sem taxa de serviço: R$ " + compra.semTaxa());
        }

        System.out.println("Valor recebido em dinheiro:");
        valorPago = dados.nextDouble();

        System.out.println("Troco: R$ " + compra.troco(valorPago));
    }
}
