/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracao;

import entidade.*;
import java.util.*;
import static gestao.Menu.*;


public class Verificar {
     public static void viewFuncionario() {
        Funcionario func;
        for(int i=0;i<funcionarios.size();i++) {
             func = (Funcionario) funcionarios.elementAt(i);
             System.out.println(func.toString());
        }
     }
     
     public static void viewFornecedor() {
         Fornecedor forne;
         for(int i = 0; i < fornecedor.size(); i++){
             forne = (Fornecedor) fornecedor.elementAt(i);
             System.out.println(forne.toString());
         }
     }
     
     public static void viewCategoria(){
         Categoria cat;
         for(int i = 0; i < categoria.size(); i++){
             cat = (Categoria) categoria.elementAt(i);
             System.out.println(cat.toString());
         }
     }
     public static void viewProduto() {
         Produto prod;
         for(int i = 0; i < produto.size(); i++){
             prod = (Produto) produto.elementAt(i);
             System.out.println(prod.toString());
         }
     }
}
