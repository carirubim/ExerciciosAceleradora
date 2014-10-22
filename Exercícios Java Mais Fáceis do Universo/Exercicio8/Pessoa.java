package Exercicio8;

/**
 * Created by alunos3 on 21/10/14.
 */
public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String RG;
    private Telefone[] listaTelefones = new Telefone[15];
    private int i = 0;


    public Pessoa (String nome, String dataNascimento, String RG){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getRG() {
        return RG;
    }

    public void setTelefone (Telefone novoTelefone){
        listaTelefones[i] = novoTelefone;
        i++;
    }
}
