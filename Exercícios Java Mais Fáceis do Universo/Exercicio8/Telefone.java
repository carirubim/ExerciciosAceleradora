package Exercicio8;

/**
 * Created by alunos3 on 21/10/14.
 */
public class Telefone {
    private String numero;
    private String modelo;
    private Contato[] listaContatos = new Contato[250];
    private int i = 0;

    public Telefone(String numero, String modelo){
        this.numero = numero;
        this.modelo = modelo;
    }

    public String getNumero() {
        return numero;
    }

    public String getModelo() {
        return modelo;
    }

    public Contato[] getListaContatos() {
        return listaContatos;
    }

    public void setListaContatos(Contato novoContato) {
        listaContatos[i] = novoContato;
        i++;
    }
}
