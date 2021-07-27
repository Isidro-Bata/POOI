package gestao;
import java.util.*;
import java.io.*;
public class Stock implements Serializable{
    private String nome, dataEntrada, dataPrazo, tipo;
    private Integer id = 0, qtdStock,qtdEntrada,quantidade;
    private Validacoes v;
    private float preco;
    public Produto prod;
    private Cliente cliente;
    public Vector<Produto> produto = new Vector();
    
    
    private FileOutputStream   fos = null;
    private ObjectOutputStream ous = null;
    private File file;
    private FileInputStream    fis = null;
    private ObjectInputStream  ois = null;
    
    public Stock(){}
   
    public void addProduto() throws IOException{
        v = new Validacoes();
        Random gerador = new Random();

        for (int i = 0; i < 1; i++) {
           nome = String.valueOf(gerador.nextInt(2050));
        }
        for (int i = 0; i < 1; i++) {
           tipo = String.valueOf(gerador.nextInt(2050));
        }
        for (int i = 0; i < 1; i++) {
           quantidade = gerador.nextInt(2050);
        }
        for (int i = 0; i < 1; i++) {
           preco = gerador.nextInt(3400);
        }
        for (int i = 0; i < 1; i++) {
           dataPrazo = String.valueOf(gerador.nextInt(2050));
        }
        for (int i = 0; i < 1; i++) {
           id = gerador.nextInt(100);
        }
        /*System.out.print("\n=== Produto ===");
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
        id =+ 1;*/
        prod = new Produto(id, nome, tipo, quantidade, preco, dataPrazo);
        produto.addElement(prod);
        produto.trimToSize();
    }
    public void armazenaDados(String nomeArq){
        try{
            file = new File(nomeArq);
            fos = new FileOutputStream(file);
            ous = new ObjectOutputStream(fos);
            
            ous.writeObject(produto);
            ous.flush();
            fos.close();
            ous.close();
            
        }catch(FileNotFoundException fx){
            System.out.println("Arquivo "+nomeArq+" nao encontrado");
        }catch(IOException ex){
            System.out.println("Problemas na leitura do ficheiro");
        }
    } 
    public void lerDados(String nomeArq){
       try{
            file = new File(nomeArq);
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            produto =  (Vector<Produto>) ois.readObject();
            ois.close();
            
        }catch(FileNotFoundException fx){
            System.out.println("Arquivo "+nomeArq+" nao encontrado");
        }catch(IOException ex){
            System.out.println("Problemas na leitura do ficheiro");
       }catch(ClassNotFoundException cx){
          System.out.println("Class nao encontrada");
        }
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