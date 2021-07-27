package gestao;
import java.io.*;
import java.util.*;
public class Cliente implements Serializable{
    private Integer id, quantidade;
    private String comprou, dataCompra;
    private double valorAPagar;
    private Validacoes v = new Validacoes();
    private BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

    public Cliente() {
    }

    public Integer getId() {
        return id;
    }
    
    public void getComprou(){}
    public void getValorAPagar(){}
    public void getDataCompra(){}

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", quantidade=" + quantidade + ", comprou=" + comprou + ", dataCompra=" + dataCompra + ", valorAPagar=" + valorAPagar +'}';
    }
    
}
