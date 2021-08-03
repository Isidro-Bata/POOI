/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracao;
import entidade.*;
import Validar.*;
import static gestao.Menu.*;

/**
 *
 * @author vm
 */
public class Remover {
    
    public static void removerFuncionario() {
        Funcionario func;
        int pos;
        int id;
        
        id =(int) Validacoes.num("ID(funcionario): ",111, 999);
  
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
        
        funcionarios.removeElementAt(pos);
        funcionarios.trimToSize();
    }
    
    public static void removerFornecedor() {
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
        
        fornecedor.removeElementAt(pos);
        fornecedor.trimToSize();
    }
    
    public static void removerProduto() {
        Produto prod;
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
        
        produto.removeElementAt(pos);
        produto.trimToSize();
    }
    
    public static void removerCategoria() {
        Categoria cat;
        Produto prod;
        int pos;
        int id;
        
        id =(int) Validacoes.num("ID(Categoria): ",111, 999);
  
        pos = -1;
        for(int i=0;i<categoria.size();i++){
            cat = (Categoria) categoria.elementAt(i);
            if(cat.getIdCategoria() == id)
                pos = i;
        }
        
        if(pos == -1) {
            System.out.println("Categoria nao existe...");
            return;
        }
        
        cat = (Categoria) categoria.elementAt(pos);
        
        for(int i=0;i<produto.size();i++){
            prod = (Produto) produto.elementAt(i);
            if(prod.getIdCategoria() == cat.getIdCategoria()){
                produto.removeElementAt(i);
                produto.trimToSize();
            }
        }
        
        categoria.removeElementAt(pos);
        categoria.trimToSize();
    }
}
