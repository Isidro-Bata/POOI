package gestao;

import java.io.*;
import java.util.*;

public class Cliente implements Serializable{
    private int id;
    private int quantidade;
    private String comprou;
    private String dataCompra;
    private double valorAPagar;

    public Cliente(int id, int quantidade, String comprou, String dataCompra, double valorAPagar) {
        this.id = id;
        this.quantidade = quantidade;
        this.comprou = comprou;
        this.dataCompra = dataCompra;
        this.valorAPagar = valorAPagar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getComprou() {
        return comprou;
    }

    public void setComprou(String comprou) {
        this.comprou = comprou;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", quantidade=" + quantidade + ", comprou=" + comprou + ", dataCompra=" + dataCompra + ", valorAPagar=" + valorAPagar +'}';
    }
    
}