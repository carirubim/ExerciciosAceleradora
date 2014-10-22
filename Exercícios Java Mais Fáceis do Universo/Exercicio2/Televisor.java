package Exercicio2;

/**
 * Created by alunos3 on 16/10/14.
 */
public class Televisor {

    private int som;
    private int canal;

    public Televisor(){
        this.som = 9;
        this.canal = 13;
    }

    public void aumentaVolume(){
        som += 1;
    }

    public void diminuiVolume(){
        som -=1;
    }

    public void aumentaCanal(){
        canal +=1;
    }

    public void diminuiCanal(){
        canal -=1;
    }

    public void trocaCanal(int canal){
        this.canal = canal;
    }

    public int getVolume(){
        return som;
    }

    public int getCanal(){
        return canal;
    }
}
