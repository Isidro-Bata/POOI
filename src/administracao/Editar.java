/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracao;

import validar.Validacoes;
import entidade.*;
import static gestao.Menu.*;

/**
 *
 * @author kiDDing
 */

public class Editar {
    public static void editarFornecedor() {
        Fornecedor forne;
        int pos;
        int id;
        
        id =(int) Validacoes.num("ID(fornecedor): ",111, 999);
  
        pos = -1;
        for(int i=0;i<fornecedor.size();i++){
            forne = (Fornecedor) fornecedor.elementAt(i);
            if(forne.getId() == id)
                pos = i;
        }
        
        if(pos == -1) {
            System.out.println("Fornecedor nao existe...");
            return;
        }
        
        forne = (Fornecedor) fornecedor.elementAt(pos);
        
        System.out.println("Insira novos dados");
        String nome = Validacoes.texto("Nome: ", 4);
        String endereco = Validacoes.texto("Endereco: ", 4);
        String telefone = Validacoes.texto("Telefone: ", 8);
        String tipoFornecedor = Validacoes.texto("Tipo: ", 4);
        String produto = Validacoes.texto("Produto: ", 4);
        
        forne.setNome(nome);
        forne.setEndereco(endereco);
        forne.setTelefone(telefone);
        forne.setTipoFornecedor(tipoFornecedor);
        forne.setProduto(produto);
        
        fornecedor.setElementAt(forne,pos);
        fornecedor.trimToSize();
    }
    
    public static void editarFuncionario() {
        Funcionario func;
        int pos;
        int id;
        
        id = (int) Validacoes.num("ID(Funcionario): ",111, 999);
  
        pos = -1;
        for(int i=0;i<funcionarios.size();i++){
            func = (Funcionario) funcionarios.elementAt(i);
            if(func.getId() == id)
                pos = i;
        }
        
        if(pos == -1) {
            System.out.println("Funcionario nao existe...");
            return;
        }
        
        func = (Funcionario) funcionarios.elementAt(pos);
        System.out.println("Insira novos dados");
        String nome = Validacoes.texto("Nome: ",2);
        String telefone = Validacoes.texto("Telefone: ",4);
        
        func.setNome(nome);
        func.setTelefone(telefone);
        
        funcionarios.setElementAt(func,pos);
        funcionarios.trimToSize();
    }
    
    public static void editarProduto() {
        Produto prod;
        String dataPrazo = "";
        int pos;
        int id;
        
        id =(int) Validacoes.num("ID(Produto): ",111, 999);
  
        pos = -1;
        for(int i=0;i<produto.size();i++){
            prod = (Produto) produto.elementAt(i);
            if(prod.getId() == id)
                pos = i;
        }
        
        if(pos == -1) {
            System.out.println("Produto nao existe...");
            return;
        }
       
        prod = (Produto) produto.elementAt(pos);
        
        System.out.println("Insira novos dados");
        String nome = Validacoes.texto("Nome: ", 4);
        float preco = (float)Validacoes.num("Preco: ",1,999999);
        int qtd = (int)Validacoes.num("Quantidade: ", 1,999999);
        String dataEntrada = Validacoes.texto("Data entrada(dd/mm/yyyy): ", 10);
        int dataCont = (int)Validacoes.num("Produto com validade? [1- SIM| 2- NÃO]: ",1,2);
        
        if(dataCont == 1)
            dataPrazo = Validacoes.texto("Data Validade(dd/mm/yyyy): ",10);
        else
            dataPrazo = "NULL";
        
        
        prod.setDataEntrada(dataEntrada);
        prod.setDataPrazo(dataPrazo);
        prod.setNome(nome);
        prod.setPreco(preco);
        prod.setQuantidade(qtd);
        
        produto.setElementAt(prod,pos);
        produto.trimToSize();
        
    }
    
    public static void editarCategoria() {
        Categoria cat;
        int pos;
        int id;
        
         id = (int) Validacoes.num("ID(Categoria): ",111,999);
  
        pos = -1;
        for(int i=0;i<categoria.size();i++){
            cat = (Categoria) categoria.elementAt(i);
            if(cat.getIdCategoria()== id)
                pos = i;
        }
        
        if(pos == -1) {
            System.out.println("Categoria nao existe...");
            return;
        }
        
        cat = (Categoria) categoria.elementAt(pos);
        
        
        String nome = Validacoes.texto("Nome: ", 4);
        cat.setNome(nome);
        categoria.setElementAt(cat,pos);
        categoria.trimToSize();
    }
    
}
