package entidade;
import java.io.*;
import java.util.*;

public class Funcionario implements Serializable{
    private int id;
    private String nome;
    private String telefone;

    public Funcionario(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        //return "id=" + id + ", nome=" + nome + ", telefone=" + telefone;
        return "%-6d%-20s%6f\n"+id+nome+telefone;
    }
}
