package gestao;

import java.util.*;
import java.io.*;

public class Fornecedor implements Serializable{
    private String nome;
    private String endereco;
    private String telefone;
    private String tipoFornecedor;
    private String produto;
    private int quantidade;
    private int id;

    public Fornecedor(String nome, String endereco, String telefone, String tipoFornecedor, String produto, int quantidade, int id) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipoFornecedor = tipoFornecedor;
        this.produto = produto;
        this.quantidade = quantidade;
        this.id = id;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoFornecedor() {
        return tipoFornecedor;
    }

    public void setTipoFornecedor(String tipoFornecedor) {
        this.tipoFornecedor = tipoFornecedor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String toString() {
        return "Fornecedor{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", tipoFornecedor=" + tipoFornecedor + ", produto=" + produto + ", quantidade=" + quantidade +'}';
    }
  
}
