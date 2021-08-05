package vendas;
import Validar.Validacoes;
import administracao.Verificar;
import entidade.*;
import static gestao.Menu.*;
import java.io.*;

public class GestaoVenda implements Serializable{
    
    public GestaoVenda(){}
    
    public void finalizarPedido(){
        
    }
    public static void pedido(){
        Produto prod;
        String produtoCompradoTotal = "", produtoComprado = "";
        int qtd = 1;
        int pos;
        boolean whileC = true;
        float precoTotal = 0.0f;
        
        while(whileC){
            int cont = 2;
            System.out.print("\tPRODUTO DISPONIVEL\n");
            System.out.printf("%-8s%-25s%-20s%-20s%-20s%-20s%-10s\n", 
                    " _______" ," ________________________", " ___________________", " ___________________", 
                    " ___________________", " ___________________", " _________________");
            System.out.printf("%-8s%-25s%-20s%-20s%-20s%-20s%-10s\n", "|Produto" ,"| Nome", "| Categoria", 
                    "| Entrada", "| Prazo", "| Quantidade", "| Preço           |");
            System.out.printf("%-8s%-25s%-20s%-20s%-20s%-20s%-10s\n", 
                    "|-------" ,"|------------------------", "|-------------------", "|-------------------", 
                    "|-------------------", "|-------------------", "|-----------------");

            for(int i = 0; i < produto.size(); i++){
                prod = (Produto) produto.elementAt(i);
                System.out.printf("|%-6d%s%-23s%s%-18s%s%-18s%s%-18s%s%-18s%s%-16s |\n", 
                        i+1, " |" ,prod.getNome(), " |", Verificar.categoriaId(prod.getIdCategoria()), " |",prod.getDataEntrada(), 
                        " |", prod.getDataPrazo(), " |",prod.getQuantidade(), " |", String.valueOf(prod.getPreco())+" MT");
            }
            System.out.printf("%-8s%-25s%-20s%-20s%-20s%-20s%-10s\n", 
                    "|-------" ,"|------------------------", "|-------------------", "|-------------------", 
                    "|-------------------", "|-------------------", "|-----------------");
            System.out.println("\n");

            
            
            int pedido = (int)Validacoes.num("Produto R.: ", 1, produto.size()+1);
            prod = (Produto) produto.elementAt(pedido - 1);
            System.out.println("Produto escolhido: "+prod.getNome()+"\nPreço Unitario: "+prod.getPreco()+" MT\n");
            
            if(prod.getQuantidade() == 0){
                System.out.println("O Produto escolhido sem estoque");
                cont = (int)Validacoes.num("Deseja continuar [1- Sim | 2 - Não]: ", 1, 2);
                if(cont == 1)
                    pedido();
                else
                    break;
            }else
                qtd = (int)Validacoes.num("Informe a quantidade: ", 1, prod.getQuantidade());
            
            produtoComprado += prod.getNome();
      
            
            /*if(!prod.getNome().equals(produtoComprado))
                produtoCompradoTotal += prod.getNome()+" Qtd. :"+qtd;
            else
                produtoCompradoTotal = prod.getNome()+" Qtd. :"+qtd; */
            
            precoTotal += prod.getPreco()*qtd;
            
            cont = (int)Validacoes.num("Deseja continuar [1- Sim | 2 - Não]: ", 1, 2);
            
            if(cont == 1)
                whileC = true;
            else
                whileC = false;
            
            prod = (Produto) produto.elementAt(pedido - 1);
            prod.setQuantidade(prod.getQuantidade()-qtd);
            produto.setElementAt(prod,pedido - 1);
            produto.trimToSize();
            gravarfich();
            
        }
        if(!(precoTotal == 0))
            System.out.println("Preco total: "+precoTotal+"\n"+produtoCompradoTotal);
    }
}
