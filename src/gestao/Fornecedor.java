package gestao;
import java.util.*;
import java.io.*;
public class Fornecedor implements Serializable{
    private String nome, endereco, telefone, tipoFornecedor, produto;
    private Integer quantidade, id;
    private BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

    public Fornecedor(){}
    
    public void atualizarTudo(){}
    public void getQtd(){}
    public void getProduto(){}

    public String toString() {
        return "Fornecedor{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", tipoFornecedor=" + tipoFornecedor + ", produto=" + produto + ", quantidade=" + quantidade +'}';
    }
  
}
