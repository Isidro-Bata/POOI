package gestao;
import java.util.*;
import java.io.*;
public class Venda implements Serializable{
    String ven = "Venda.txt";
    private Integer id;
    private Funcionario funcionario;
    private Stock estoque = new Stock();
    private Cliente cliente;
    private double valorTotal;
    
    private FileOutputStream   fos = null;
    private ObjectOutputStream ous = null;
    private File file;
    private FileInputStream    fis = null;
    private ObjectInputStream  ois = null;
    private Vector vendCompra = new Vector();
    public Venda(){}
    
    public void armazenaDadosVenda(Integer id, Produto pro){
        try{
            vendCompra = estoque.funcionarioVende(id, pro);
            file = new File(ven);
            fos = new FileOutputStream(file);
            ous = new ObjectOutputStream(fos);
            
            ous.writeObject(vendCompra);
            ous.flush();
            fos.close();
            ous.close();
            
        }catch(FileNotFoundException fx){
            System.out.println("Arquivo "+ven+" nao encontrado");
        }catch(IOException ex){
            System.out.println("Problemas na leitura do ficheiro");
        }
    } 
    public void lerDadosVenda(){
       try{
            file = new File(ven);
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            vendCompra = (Vector) ois.readObject();
            ois.close();
            
        }catch(FileNotFoundException fx){
            System.out.println("Arquivo "+ven+" nao encontrado");
        }catch(IOException ex){
            System.out.println("Problemas na leitura do ficheiro");
       }catch(ClassNotFoundException cx){
          System.out.println("Class nao encontrada");
        }
    }
    
    
    public void atualizarTudo(){}
    public void getQtd(){}
    public void getProduto(){}
    
}