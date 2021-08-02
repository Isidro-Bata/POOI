package entidade;

import java.io.*;
import java.util.*;

public class Produto extends Stock implements Serializable{
    private float preco;

    public Produto(int id, String nome, String dataEntrada, String dataPrazo, int quantidade, int qtdEntrada, int idCategoria, float preco) {
        super(id, nome, dataEntrada, dataPrazo, quantidade, qtdEntrada, idCategoria);
        this.preco = preco;
    }
    
    public Produto(Stock st, float preco) {
        super(st);
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }    

    @Override
    public String toString() {
        return super.toString() + "preco=" + preco;
    }
}
