package Exercicio2;
/**
 * Created by alunos3 on 16/10/14.
 */
public class App {
    public static void main(String[] args){

        Televisor meuTelevisor = new Televisor();

        meuTelevisor.aumentaCanal();
        meuTelevisor.aumentaVolume();
        meuTelevisor.aumentaVolume();
        System.out.println(meuTelevisor.getCanal());
        System.out.println(meuTelevisor.getVolume());
        meuTelevisor.trocaCanal(41);
        meuTelevisor.diminuiVolume();
        System.out.println(meuTelevisor.getCanal());
        System.out.println(meuTelevisor.getVolume());
    }
}
