package Exercicio1;

/**
 * Created by alunos3 on 16/10/14.
 */
public class Elevador {
    private int andar;

    public Elevador(){
          andar = 0;
    }

    public void sobe(){
        andar += 1;

    }
    public void desce(){
        andar -= 1;
    }

    public int getAndar(){
        return andar;
    }
}


