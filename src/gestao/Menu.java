package gestao;

import Validar.Validacoes;
import leituraEscrita.*;

import java.io.*;
import java.util.*;

class Menu {
    public static Vector funcionarios, fornecedor, categoria, produto;
    
    public Menu() {
        menu();
    }
    
    private void menu() {
        byte opc;
        lerfich();
        do{
            System.out.print("\tEntrar como:");
            System.out.print("\n1 - Administrador");
            System.out.print("\n2 - Cliente");
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
            System.out.print("\n1 - Verificar todos produtos");
            System.out.print("\n2 - Adicionar produtos");
            System.out.print("\n3 - Voltar");
            opc = (byte) Validacoes.num("\nR: ",1,3);
            switch(opc){
                case 1:
                    System.out.println("\tTodos produtos");
                    break;
                case 2:
                    System.out.println("\tAdicionar produtos");
                    break;
            }
        }while(opc != 3);
    }
    
    private void menu2() {
        byte opc;
        do{
            System.out.print("\tCliente:");
            System.out.print("\n1 - Comprar um produto");
            System.out.print("\n2 - Voltar");
            System.out.print("\n3 - Sair");
            opc = (byte) Validacoes.num("\nR: ",1,3);
            switch(opc){
                case 1:

                    break;
                case 2:
                    break;
            }
        }while(opc != 3);
    }
    
    private void lerfich() {
        funcionarios = LeituraEscrita.read("funcionario.dat");
        fornecedor = LeituraEscrita.read("fornecedor.dat");
        categoria = LeituraEscrita.read("categoria.dat");
        produto = LeituraEscrita.read("produto.dat");
    }
    
    private void gravarfich() {
        LeituraEscrita.write("funcionario.dat",funcionarios);
        LeituraEscrita.write("fornecedor.dat",fornecedor);
        LeituraEscrita.write("categoria.dat",categoria);
        LeituraEscrita.write("produto.dat",produto);
    }
}
