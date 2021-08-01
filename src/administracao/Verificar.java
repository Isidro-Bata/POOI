/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administracao;

import entidade.*;
import java.util.*;

/**
 *
 * @author vm
 */
public class Verificar {
    private Fornecedor fornecedor;
    private Stock estoque;
    private Produto produto;
    private Funcionario funcionario;
    private Vector vect = new Vector();
    
    public Verificar(){}
    
    public Object all(String nClass, Vector vect, String info){
        
        for(nClass inf : vect){
            if(inf.getId()== Integer.parseInt(info)){
                return inf;
            }
            if(inf.getNome().equals(info)){
                return inf;
            }
        }
        return null;
        
    }
    public Fornecedor getFornecedor(String info, Vector<Fornecedor> vect) {
        /*for(Fornecedor inf : vect){
            if(inf.getId()== Integer.parseInt(info)){
                return inf;
            }
            if(inf.getNome().equals(info)){
                return inf;
            }
        }*/
        
        
        return (Fornecedor)all("Fornecedor",vect,info);
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Stock getEstoque(String info, Vector<Stock> vect) {
       return (Stock)all("Stock",vect,info);
    }

    public void setEstoque(Stock estoque) {
        this.estoque = estoque;
    }

    public Produto getProduto(String info, Vector<Produto> vect) {
        return (Produto)all("Produto",vect,info);
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Funcionario getFuncionario(String info, Vector<Funcionario> vect) {
        return (Funcionario)all("Funcionario",vect,info);
        
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
    
}
