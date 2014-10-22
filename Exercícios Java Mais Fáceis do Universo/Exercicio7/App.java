package Exercicio7;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by alunos3 on 16/10/14.
 */
public class App {


    public static void main(String[] args){

    Random gerador = new Random();
    Scanner ler = new Scanner(System.in);

    int numTent = 10, numDig;
    int numero = gerador.nextInt(30) + 1;

    while(numTent > 0){

            System.out.println("Gerador de Números Randômicos");
            System.out.print("Digite um número entre 1 e 30, (Você tem apenas " + numTent + " tentaivas): ");
            numDig = ler.nextInt();

            if(numDig == numero){

                System.out.println("Parabéns você acertou em " + numTent + " tentativas!");
                numTent = -1;
            }
            else if(numDig > numero){
                System.out.println("O número digitado é maior que o número sorteado!");
            }
            else{
                System.out.println("O número digitado é menor que o número sorteado!");
            }
            numTent --;
        }
        System.out.println("O número sorteado foi " + numero);
    }
}