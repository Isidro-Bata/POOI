package entidade;

import java.util.*;
import java.io.*;

public class Stock implements Serializable{
    private int id;
    private String nome;
    private String categoria;
    private String dataEntrada;
    private String dataPrazo;
    private int quantidade;
    private int qtdEntrada;

    public Stock(int id, String nome, String categoria, String dataEntrada, String dataPrazo, int quantidade, int qtdEntrada) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.dataEntrada = dataEntrada;
        this.dataPrazo = dataPrazo;
        this.quantidade = quantidade;
        this.qtdEntrada = qtdEntrada;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataPrazo() {
        return dataPrazo;
    }

    public void setDataPrazo(String dataPrazo) {
        this.dataPrazo = dataPrazo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQtdEntrada() {
        return qtdEntrada;
    }

    public void setQtdEntrada(int qtdEntrada) {
        this.qtdEntrada = qtdEntrada;
    }

    @Override
    public String toString() {
        return "Stock{" + "id=" + id + ", nome=" + nome + ", categoria=" + categoria + ", dataEntrada=" + dataEntrada + ", dataPrazo=" + dataPrazo + ", quantidade=" + quantidade + ", qtdEntrada=" + qtdEntrada + '}';
    }
}