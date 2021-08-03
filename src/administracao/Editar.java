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
    
    public static void editarStock() {
        
    }
    
    public static void editarProduto() {
        
    }
    
    public static void editarVenda() {
        
    }
}
