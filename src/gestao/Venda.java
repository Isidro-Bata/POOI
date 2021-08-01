package gestao;
import Entidade.Funcionario;
import Entidade.Cliente;
import Entidade.Stock;
import java.util.*;
import java.io.*;

public class Venda implements Serializable{
    private Integer id;
    private Funcionario funcionario;
    private Stock estoque = new Stock();
    private Cliente cliente;
    private double valorTotal;
    private Vector vendCompra = new Vector();
    
    public Venda(){}
    
    public void atualizarTudo(){}
    public void getQtd(){}
    public void getProduto(){}
    
}