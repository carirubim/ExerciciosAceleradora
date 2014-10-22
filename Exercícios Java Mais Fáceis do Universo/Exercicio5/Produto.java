package Exercicio5;

/**
 * Created by alunos3 on 16/10/14.
 */
public class Produto {

    private int codigo;
    private String descricao;
    private double preco;
    private int qntdEstoque;

    public Produto(int codigo, String descricao, double preco, int qntdEstoque){
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.qntdEstoque = qntdEstoque;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQntdEstoque() {
        return qntdEstoque;
    }

    public void setQntdEstoque(int qntdEstoque) {
        this.qntdEstoque = qntdEstoque;
    }

    public double promocao (int codigo, double valor){
        double valorPromocao=0;
        if (codigo <= 2){
            return valorPromocao = valor - (valor * 0.05);
        }
        else if (codigo == 3){
            return valorPromocao = valor - (valor * 0.07);
        }
        else if (codigo ==4 || codigo ==5){
            return valorPromocao = valor - (valor * 0.1);
        }
        else{
            return valor;
        }
    }

}
