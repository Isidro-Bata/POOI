package gestao;
import Validar.Validacoes;
import entidade.Stock;
import java.io.*;
import java.util.*;

class Menu {
    public static Vector funcionarios, stock, fornecedor, categoria, produto;
    
    public Menu() { 
        menu();
    }
    
    private void menu() {
        byte opc;
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
    }
    
    private void menu1() {
        byte opc;
        do{
            System.out.print("\tAdministrador:");
            System.out.print("\n1 - Verificar todos produtos");
            System.out.print("\n2 - Adicionar produtos");
            System.out.print("\n3 - Voltar");
            System.out.print("\n4 - Sair");
            opc = (byte) Validacoes.num("\nR: ",1,4);
            switch(opc){
                case 1:
                    System.out.println("\tTodos produtos");
                    break;
                case 2:
                    System.out.println("\tAdicionar produtos");
                    break;
                case 3:

                    break;
            }
        }while(opc != 4);
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
}
