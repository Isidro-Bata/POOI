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
        System.out.print("\tFUNCIONARIO\n");
        System.out.printf("%-8s%-25s%-10s\n", " _______"," ________________________"," ___________________");
        System.out.printf("%-8s%-25s%-10s\n", "|ID","| Nome","| Telefone          |");
        System.out.printf("%-8s%-25s%-10s\n", "|-------","|------------------------","|-------------------|");
        for(int i=0;i<funcionarios.size();i++) {
             func = (Funcionario) funcionarios.elementAt(i);
             System.out.printf("|%-6d%s%-23s%s%-18s |\n", func.getId(), " |", func.getNome(), " |", func.getTelefone());
        }
        System.out.printf("%-8s%-25s%-10s\n", "|-------","|------------------------","|-------------------|");
        System.out.println("\n");
     }
     
     public static void viewFornecedor() {
         Fornecedor forne;
         System.out.print("\tFORNECEDOR\n");
         System.out.printf("%-8s%-25s%8s%17s%25s%17s\n", " _______", " ________________________", 
                           " __________________________", " _________________", " ________________________", 
                           " ___________________");
         System.out.printf("%-8s%-25s%8s%30s%25s%26s\n", "|ID", "| Nome", "| Endereço", "| Telefone   ", "| Tipo de Fornecedor", 
                 "| Produto           |");
         System.out.printf("%-8s%-25s%8s%17s%25s%17s\n", "|------", "|------------------------", 
                           "|--------------------------", "|-----------------", "|------------------------", 
                           "|-------------------|");
         for(int i = 0; i < fornecedor.size(); i++){
            forne = (Fornecedor) fornecedor.elementAt(i);
            System.out.printf("|%-6d%s%-23s%s%-25s%s%-16s%s%-23s%s%-18s |\n", forne.getId()," |",
                    forne.getNome(), " |", forne.getEndereco(), " |",
                    forne.getTelefone(), " |", forne.getTipoFornecedor(), " |", forne.getProduto());
         }
         System.out.printf("%-8s%-25s%8s%17s%25s%17s\n", "|------", "|------------------------", 
                           "|--------------------------", "|-----------------", "|------------------------", 
                           "|-------------------|");
         System.out.println("\n");
     }
     
     public static void viewCategoria(){
         Categoria cat;
         System.out.print("\tCATEGORIA\n");
         System.out.printf("%-8s%-25s\n", " _______"," ___________________");
         System.out.printf("%-8s%-25s\n", "|ID" ,"| Nome              |");
         System.out.printf("%-8s%-25s\n", "|-------","|-------------------|");
         for(int i = 0; i < categoria.size(); i++){
             cat = (Categoria) categoria.elementAt(i);
             System.out.printf("|%-6d%s%-18s |\n", cat.getIdCategoria(), " |", cat.getNome());
         }
         System.out.printf("%-8s%-25s\n", "|-------","|-------------------|");
         System.out.println("\n");
     }
     public static void viewProduto() {
         Produto prod;
         System.out.print("\tPRODUTO\n");
         System.out.printf("%-8s%-25s%-20s%-20s%-20s%-20s%-10s\n", 
                 " _______" ," ________________________", " ___________________", " ___________________", 
                 " ___________________", " ___________________", " _________________");
         System.out.printf("%-8s%-25s%-20s%-20s%-20s%-20s%-10s\n", "|ID" ,"| Nome", "| Categoria", 
                 "| Entrada", "| Prazo", "| Quantidade", "| Preço           |");
         System.out.printf("%-8s%-25s%-20s%-20s%-20s%-20s%-10s\n", 
                 "|-------" ,"|------------------------", "|-------------------", "|-------------------", 
                 "|-------------------", "|-------------------", "|-----------------");
         
         for(int i = 0; i < produto.size(); i++){
             prod = (Produto) produto.elementAt(i);
             System.out.printf("|%-6d%s%-23s%s%-18s%s%-18s%s%-18s%s%-18s%s%-16s |\n", 
                     prod.getId() , " |" ,prod.getNome(), " |", categoriaId(prod.getIdCategoria()), " |",prod.getDataEntrada(), 
                     " |", prod.getDataPrazo(), " |",prod.getQuantidade(), " |", String.valueOf(prod.getPreco())+" MT");
         }
         System.out.printf("%-8s%-25s%-20s%-20s%-20s%-20s%-10s\n", 
                 "|-------" ,"|------------------------", "|-------------------", "|-------------------", 
                 "|-------------------", "|-------------------", "|-----------------");
         System.out.println("\n");
     }
     
     public static String categoriaId(int id){
        Categoria cat;
        String categ = "";
       for(int i = 0; i < categoria.size(); i++){
             cat = (Categoria) categoria.elementAt(i);
             if(cat.getIdCategoria() == id){
                 categ = cat.getNome();
                 break;
             }
       }
       return categ;
     }
}
