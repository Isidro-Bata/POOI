package entidade;

import java.util.*;
import java.io.*;

public class Fornecedor implements Serializable{
    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private String tipoFornecedor;
    private String produto;

    public Fornecedor(int id, String nome, String endereco, String telefone, String tipoFornecedor, String produto) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipoFornecedor = tipoFornecedor;
        this.produto = produto;
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
    
    public String toString() {
        return "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", tipoFornecedor=" + tipoFornecedor + ", produto=" + produto;
    }
  
}
