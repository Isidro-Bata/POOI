package gestao;

import java.io.*;
import java.util.*;

public class Produto implements Serializable{
    private int id;
    private int quantidade;
    private boolean estado;
    private float preco;
    private String nome;
    private String tipo;
    private String dataPrazo;

    public Produto(int id, String nome, String tipo, int quantidade, float preco, String dataPrazo){
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
   public String toString() {
        return "id=" + id + ",nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + ", , tipo=" + tipo + ", dataPrazo=" +dataPrazo+"";
    }    
}
