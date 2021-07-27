package gestao;
import java.util.*;
import java.io.*;
public class Fornecedor implements Serializable{
    private String nome, endereco, telefone, tipoFornecedor, produto;
    private Integer quantidade;
    private Validacoes v = new Validacoes();
    private BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

    public Fornecedor() throws IOException {
        System.out.print("\n=== Fornecedor ===");
        System.out.print("\nNome: ");
        nome = v.validaString();
        System.out.print("Endereco: ");
        endereco = v.validaString();
        System.out.print("Telefone: ");
        telefone = v.validaString();
        System.out.print("Tipo de fornecedor: ");
        tipoFornecedor = v.validaString();
        System.out.print("Produto: ");
        produto = v.validaString();
        System.out.print("Quantidade: ");
        quantidade = v.validaInt();
    }
    
    
    public void atualizarTudo(){}
    public void getQtd(){}
    public void getProduto(){}

    public String toString() {
        return "Fornecedor{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", tipoFornecedor=" + tipoFornecedor + ", produto=" + produto + ", quantidade=" + quantidade +'}';
    }

    
    
    
}
