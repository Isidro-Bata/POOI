package gestao;

import validar.Validacoes;
import administracao.*;
import leituraEscrita.*;
import vendas.*;
import java.io.*;
import java.util.*;

public class Menu {
    public static Vector funcionarios, fornecedor, categoria, produto, historico;
    
    public Menu() {
        menu();
    }
    
    private void menu() {
        byte opc;
        lerfich();
        do{
            System.out.print("\tEntrar como:");
            System.out.print("\n1 - Administrador");
            System.out.print("\n2 - Caixa");
            System.out.print("\n3 - Sair");
            opc = (byte) Validacoes.num("\nR: ",1,3);
            switch(opc){
                case 1:
                    menu1();
                    break;
                case 2:
                    menu2();
                break;
            }
        }while(opc != 3);
        gravarfich();
    }
    
    private void menu1() {
        byte opc;
        do{
            System.out.print("\tAdministrador:");
            System.out.print("\n1 - Adicionar");
            System.out.print("\n2 - Visualizar");
            System.out.print("\n3 - Actualizar");
            System.out.print("\n4 - Remover");
            System.out.print("\n5 - Voltar");
            opc = (byte) Validacoes.num("\nR: ",1,5);
            switch(opc){
                case 1:
                    menu11();
                    break;
                case 2:
                    menu12();
                    break;
                case 3:
                    menu13();
                break;
                case 4:
                    menu14();
                break;
            }
        }while(opc != 5);
    }
    
    private void menu11() {
        byte opc;
        do{
            System.out.print("\tAdicionar:");
            System.out.print("\n1 - Funcionario");
            System.out.print("\n2 - Fornecedor");
            System.out.print("\n3 - Categoria");
            System.out.print("\n4 - Produto");
            System.out.print("\n5 - Voltar");
            opc = (byte) Validacoes.num("\nR: ",1,5);
            switch(opc){
                case 1:
                    Adicionar.adicionarFuncionario();
                    break;
                case 2:
                    Adicionar.adicionarFornecedor();
                    break;
                case 3:
                    Adicionar.adicionarCategoria();
                    break;
                case 4:
                    Adicionar.adicionarProduto();
                    break;
            }
        }while(opc != 5);
    }
    
    private void menu12() {
        byte opc;
        do{
            System.out.print("\tVisualizar:");
            System.out.print("\n1 - Funcionario");
            System.out.print("\n2 - Fornecedor");
            System.out.print("\n3 - Categoria");
            System.out.print("\n4 - Produto");
            System.out.print("\n5 - Voltar");
            opc = (byte) Validacoes.num("\nR: ",1,5);
            switch(opc){
                case 1:
                    Verificar.viewFuncionario();
                    break;
                case 2:
                    Verificar.viewFornecedor();
                    break;
                case 3:
                    Verificar.viewCategoria();
                break;
                case 4:
                    Verificar.viewProduto();
                break;
            }
        }while(opc != 5);
    }
    
    private void menu13() {
        byte opc;
        do{
            System.out.print("\tActualizar:");
            System.out.print("\n1 - Funcionario");
            System.out.print("\n2 - Fornecedor");
            System.out.print("\n3 - Categoria");
            System.out.print("\n4 - Produto");
            System.out.print("\n5 - Voltar");
            opc = (byte) Validacoes.num("\nR: ",1,5);
            switch(opc){
                case 1:
                    Editar.editarFuncionario();
                    break;
                case 2:
                    Editar.editarFornecedor();
                    break;
                case 3:
                    Editar.editarCategoria();
                     break;
                case 4:
                    Editar.editarProduto();
                    break;
            }
        }while(opc != 5);
    }
    
    private void menu14() {
        byte opc;
        do{
            System.out.print("\tRemover:");
            System.out.print("\n1 - Funcionario");
            System.out.print("\n2 - Fornecedor");
            System.out.print("\n3 - Categoria");
            System.out.print("\n4 - Produto");
            System.out.print("\n5 - Voltar");
            opc = (byte) Validacoes.num("\nR: ",1,5);
            switch(opc){
                case 1:
                    Remover.removerFuncionario();
                    break;
                case 2:
                    Remover.removerFornecedor();
                    break;
                case 3:
                    Remover.removerCategoria();
                    break;
                case 4:
                    Remover.removerProduto();
                    break;
            }
        }while(opc != 5);
    }
    
    private void menu2() {
        byte opc;
        do{
            System.out.print("\tCaixa:");
            System.out.print("\n1 - Vender produto");
            System.out.print("\n2 - Voltar");
            opc = (byte) Validacoes.num("\nR: ",1,3);
            switch(opc){
                case 1:
                    GestaoVenda.pedido();
                    break;
            }
        }while(opc != 2);
    }
    
    private void lerfich() {
        funcionarios = LeituraEscrita.read("funcionario.dat");
        fornecedor = LeituraEscrita.read("fornecedor.dat");
        categoria = LeituraEscrita.read("categoria.dat");
        produto = LeituraEscrita.read("produto.dat");
        historico = LeituraEscrita.read("historico.dat");
    }
    
    public void gravarfich() {
        LeituraEscrita.write("funcionario.dat",funcionarios);
        LeituraEscrita.write("fornecedor.dat",fornecedor);
        LeituraEscrita.write("categoria.dat",categoria);
        LeituraEscrita.write("produto.dat",produto);
        LeituraEscrita.write("historico.dat",historico);
    }
}
