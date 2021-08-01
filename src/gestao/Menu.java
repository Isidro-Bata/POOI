package gestao;
import Entidade.Stock;
import java.io.*;
import java.util.*;
class Menu {
    private byte opc;
    private int qtd;
    private Stock est = new Stock();
    private Validacoes v = new Validacoes();
    private String arq1 = "produto.txt";
    private BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
    
    public Menu() throws IOException{
        String opcao = "";
        do{
            
            System.out.print("\tEntrar como:");
            System.out.print("\n1 - Administrador");
            System.out.print("\n2 - Cliente");
            System.out.print("\n3 - Sair");
            System.out.print("\nR.: ");
            opc = (byte)v.validaInt();
            switch(opc){
                case 1:
                    do{
                        System.out.print("\tAdministrador:");
                        System.out.print("\n1 - Verificar todos produtos");
                        System.out.print("\n2 - Adicionar produtos");
                        System.out.print("\n3 - Voltar");
                        System.out.print("\n4 - Sair");
                        System.out.print("\nR.: ");
                        opc = (byte)v.validaInt();
                        
                        switch(opc){
                            case 1:
                                System.out.println("\tTodos produtos");
                                est.lerDados(arq1);
                                System.out.println(est.toString());
                                break;
                            case 2:
                                System.out.println("\tAdicionar produtos");
                                System.out.print("Quantos produtos deseja armazenar? \nR.: ");
                                opc = (byte)v.validaInt();
                                
                                for(int i = 0; i < opc; i++){
                                    System.out.println("\nProduto"+(i+1));
                                    est.addProduto();
                                }
                                est.armazenaDados(arq1);
                                break;
                            case 3:
                                Menu m = new Menu();
                                break;
                        }
                    }while(opc != 4);
                    break;
                case 2:
                
                    do{
                        System.out.print("\tCliente:");
                        System.out.print("\n1 - Comprar um produto");
                        System.out.print("\n2 - Voltar");
                        System.out.print("\n3 - Sair");
                        System.out.print("\nR.: ");
                        opc = (byte)v.validaInt();
                        switch(opc){
                            case 1:
                                
                                break;
                            case 2:
                                Menu m = new Menu();
                                break;
                        }
                    }while(opc != 3);
            }
        }while(opc != 3);
    }
}
