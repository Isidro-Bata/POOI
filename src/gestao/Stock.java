package gestao;
import java.util.*;
import java.io.*;
public class Stock implements Serializable{
    private String nome, dataEntrada, dataPrazo, tipo;
    private Integer id = 0, qtdStock,qtdEntrada,quantidade;
    private float preco;
    public Produto prod;
    private Cliente cliente;
    public Vector<Produto> produto = new Vector();
    
    public Stock(){}
  
    public void addProduto() throws IOException{
        v = new Validacoes();
        System.out.print("\n=== Produto ===");
        System.out.print("\nNome: ");
        nome = v.validaString();
        System.out.print("Tipo: ");
        tipo = v.validaString();
        System.out.print("Quantidade: ");
        quantidade = v.validaInt();
        System.out.print("Preco: ");
        preco = v.validaFloat();
        System.out.print("Prazo: ");
        dataPrazo = v.validaString();
        id =+ 1;
        prod = new Produto(id, nome, tipo, quantidade, preco, dataPrazo);
        produto.addElement(prod);
        produto.trimToSize();
    }
    public Produto clienteCompra(String produtoCompra){
        
        for(Produto l : produto){
            if(l.getId() == Integer.parseInt(produtoCompra)){
                return l;
            }
            if(l.getNome().equals(produtoCompra)){
                return l;
            }
        }
        return null;
    }
    public void confirmaCompra(String produtoCompra){
        cliente = new Cliente();
        funcionarioVende(cliente.getId(), clienteCompra(produtoCompra));
    }
    public Vector funcionarioVende(Integer idCliente, Produto pro){
        Vector venda = new Vector();
        Object com = new Object();
        com = idCliente+""+pro;
        venda.addElement(com);
        venda.trimToSize();
        return venda;
    }
    
    public Vector funcionarioVendeComfirma(Vector n){
        
        return n;
    }
    public void exibirProduto(Produto produto){
        if(produto != null){
            System.out.println("================================");
            System.out.print(produto.getId()+""+
                             produto.getNome()+""+
                             produto.getPreco()+""+
                             produto.getTipo());
            
        }
    }
    public String getPrazo(){ return dataPrazo;}
    public void atualizarStock(){}
    
    public String toString(){
        String visual = "";
        for(int i = 0; i < produto.size(); i++ ){
            prod = produto.elementAt(i);
            visual += "\n "+prod;
        }
        return visual;
    }

    
    
}