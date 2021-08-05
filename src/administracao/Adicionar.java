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
        
        int id = (int) Validacoes.num("ID(Funcionario): ",111, 999);
        String nome = Validacoes.texto("Nome: ",2);
        String telefone = Validacoes.texto("Telefone: ",4);
        
        Funcionario func = new Funcionario(id,nome,telefone);
        
        funcionarios.addElement(func);
        funcionarios.trimToSize();
    }
    
    public static void adicionarProduto() {
        Produto prod;
        Stock stock = addStock();
        float preco = (float) Validacoes.num("Preco: ",1,999999);
        int pos;
        
        if((pos = Validacoes.verificarProd(stock.getId())) != -1) {
            prod = (Produto) produto.elementAt(pos);
            prod.setQuantidade(stock.getQuantidade()+prod.getQuantidade());
            produto.setElementAt(prod, pos);
            produto.trimToSize();
        }else {
            prod = new Produto(stock,preco);
            produto.addElement(prod);
            produto.trimToSize();
        }
    }
    
    private static Stock addStock() {
        String dataPrazo = "";
        int id = (int) Validacoes.num("ID(Stock): ",111,999);
        String nome = Validacoes.texto("Nome: ", 4);
        String dataEntrada = Validacoes.texto("Data(dd/mm/yyyy): ",10);
        int dataCont = (int)Validacoes.num("Produto com validade? [1- SIM| 2- NÃO]: ",1,2);
        
        if(dataCont == 1)
            dataPrazo = Validacoes.texto("Data Validade(dd/mm/yyyy): ",10);
        else
            dataPrazo = "NULL";
        
        int quantidade = (int) Validacoes.num("Quantidade: ",1, 9999);
        int idCategoria = (int) Validacoes.num("ID(categoria): ",111,999);
        
        if(Validacoes.verificarCat(idCategoria) == -1)
            idCategoria = adicionarCategoria();
        
        
        Stock stock = new Stock(id,nome,dataEntrada,dataPrazo,quantidade,idCategoria);
        return stock;
    }
    
    public static int adicionarCategoria() {
        
        int id = (int) Validacoes.num("ID(Categoria): ",111,999);
        String nome = Validacoes.texto("Nome: ", 4);
        
        Categoria cat = new Categoria(id,nome);
        categoria.addElement(cat);
        categoria.trimToSize();
        
        return id;
    }
    
    public static int adicionarFornecedor() {
        
        int id = (int) Validacoes.num("ID(Fornecedor): ",111,999);
        String nome = Validacoes.texto("Nome: ", 4);
        String endereco = Validacoes.texto("Endereco: ", 4);
        String telefone = Validacoes.texto("Telefone: ", 8);
        String tipoFornecedor = Validacoes.texto("Tipo: ", 4);
        String produto = Validacoes.texto("Produto: ", 4);
        
        Fornecedor forn = new Fornecedor(id,nome,endereco,telefone,tipoFornecedor,produto);
        fornecedor.addElement(forn);
        fornecedor.trimToSize();
        
        return id;
    }
}
