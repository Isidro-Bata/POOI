package entidade;

import java.util.*;
import java.io.*;

public class Stock implements Serializable{
    protected int id;
    protected String nome;
    protected String dataEntrada;
    protected String dataPrazo;
    protected int quantidade;
    protected int qtdEntrada;
    protected int idCategoria;

    public Stock(int id, String nome, String dataEntrada, String dataPrazo, int quantidade, int qtdEntrada, int idCategoria) {
        this.id = id;
        this.nome = nome;
        this.dataEntrada = dataEntrada;
        this.dataPrazo = dataPrazo;
        this.quantidade = quantidade;
        this.qtdEntrada = qtdEntrada;
        this.idCategoria = idCategoria;
    }
    
    public Stock(Stock st) {
        this.id = st.getId();
        this.nome = st.getNome();
        this.dataEntrada = st.getDataEntrada();
        this.dataPrazo = st.getDataPrazo();
        this.quantidade = st.getQuantidade();
        this.qtdEntrada = st.getQtdEntrada();
        this.idCategoria = st.getIdCategoria();
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

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
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
        return "Stock{" + "id=" + id + ", nome=" + nome + ", categoria=" + idCategoria + ", dataEntrada=" + dataEntrada + ", dataPrazo=" + dataPrazo + ", quantidade=" + quantidade + ", qtdEntrada=" + qtdEntrada + '}';
    }
}