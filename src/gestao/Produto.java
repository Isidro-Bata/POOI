package gestao;

import java.io.*;
import java.util.*;

public class Produto implements Serializable{
    private Integer id, quantidade;
    private boolean estado;
    private Validacoes v;
    private float preco;
    private String nome, tipo,dataPrazo;
    private Vector pro = new Vector();

    public Produto(Integer id, String nome, String tipo, Integer quantidade, float preco, String dataPrazo){
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.preco = preco;
        this.dataPrazo = dataPrazo;
        
    }

    public Integer getId() {
        return id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDataPrazo() {
        return dataPrazo;
    }
    
   public String toString() {
        return "id=" + id + ",nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + ", , tipo=" + tipo + ", dataPrazo=" +dataPrazo+"";
    }    
}
