/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracao;
import entidade.*;
import Validar.Validacoes;
import static gestao.Menu.*;
/**
 *
 * @author vm
 */
public class Adicionar {
    
    public static void adicionarFuncionario() {
        
        int id = (int) Validacoes.num("ID: ",111, 999);
        String nome = Validacoes.texto("Nome: ",2);
        String telefone = Validacoes.texto("Telefone: ",4);
        
        Funcionario func = new Funcionario(id,nome,telefone);
        
        funcionarios.addElement(func);
        funcionarios.trimToSize();
    }
    
    public static void adicionarProduto() {
        
        Stock stock = addStock();
        float preco = (float) Validacoes.num("Preco: ",1,999999);
        
        Produto prod = new Produto(stock,preco);
        
        produto.addElement(prod);
        produto.trimToSize();
    }
    
    private static Stock addStock() {
        
        int id = (int) Validacoes.num("ID: ",111,999);
        String nome = Validacoes.texto("Nome: ", 4);
        String dataEntrada = Validacoes.texto("Data(dd/mm/yyyy): ",10);
        String dataPrazo = Validacoes.texto("Data Validade(dd/mm/yyyy): ",10);
        int quantidade = (int) Validacoes.num("Quantidade: ",1, 9999);
        int idCategoria = (int) Validacoes.num("ID(categoria): ",111,999);
        
        if(Validacoes.verificarCat(idCategoria) == -1)
            idCategoria = adicionarCategoria();
        
        Stock stock = new Stock(id,nome,dataEntrada,dataPrazo,quantidade,idCategoria);
        return stock;
    }
    
    public static int adicionarCategoria() {
        
        int id = (int) Validacoes.num("ID: ",111,999);
        String nome = Validacoes.texto("Nome: ", 4);
        
        Categoria cat = new Categoria(id,nome);
        categoria.addElement(cat);
        categoria.trimToSize();
        
        return id;
    }
    
    public static void adicionarVenda() {
        
    }
    
    public static void adicionarFornecedor() {
        
    }
}
