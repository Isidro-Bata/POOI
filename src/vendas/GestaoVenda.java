package vendas;
import validar.Validacoes;
import administracao.Verificar;
import entidade.*;
import static gestao.Menu.*;
import java.io.*;
import java.util.*;

public class GestaoVenda implements Serializable{
    private static Vector venda;
    
    public GestaoVenda(){}
    
    public static void finalizarPedido(float preco){
            Funcionario func;
            Fatura fat;
            Produto prod;
            
            System.out.println("Valor a pagar: "+preco+" MT\n1 - Confirmar\n2 - Cancelar\n");
            byte conf = (byte)Validacoes.num("R.: ", 1, 2);
            
            if(conf == 2) return;
            
            for(int i = 0; i < venda.size(); i++){
                fat = (Fatura) venda.elementAt(i);
                for(int j = 0; j < produto.size(); j++){
                    prod = (Produto) produto.elementAt(j);
                    if(fat.getProduto().equalsIgnoreCase(prod.getNome())){
                        prod.setQuantidade(prod.getQuantidade()-fat.getQuantidade());
                        produto.setElementAt(prod,j);
                        produto.trimToSize();
                    }
                }
            }
            System.out.println("\tRECIBO");
            System.out.printf("\n\n%-20s%-15s%-15s\n", " ______________________","_____________________________","______________");
            System.out.printf("| %65s\n%-30s%-15s%20s |\n", " |","| Produto"," Quantidade ","Subtotal ");
            for(int i = 0; i < venda.size(); i++){
                fat = (Fatura) venda.elementAt(i);
                System.out.printf("%s%-30s%10d%22.2f%s\n", "|", fat.getProduto(),fat.getQuantidade(),fat.getSubtotal()," MT|");
            }
            System.out.printf("%s%66s\n", "|","------------------------------------- |");
            System.out.printf("%s%40s%22.2f%s \n","|" ,"Preço Total:", preco, " MT|");
            System.out.printf("%s%66s\n|%-20s%-15s%-13s%s\n","|","|" ,"______________________","_____________________________","______________","|");
            
    }
    
    public static void pedido(){
        Produto prod = null;
        Fatura fat = null;
        venda = new Vector();
        
        int qtd = 0;
        int pos, posi;
        boolean whileC = true;
        float precoTotal = 0.0f, preco = 0.0f;
        
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

            
            int pedido = (int)Validacoes.num("Produto R.: ", 1, produto.size());
            prod = (Produto) produto.elementAt(pedido - 1);
            System.out.println("\nProduto escolhido: "+prod.getNome()+"\nPreço Unitario: "+prod.getPreco()+" MT");
            
            
            if(prod.getQuantidade() == 0){
                System.out.println("O Produto escolhido sem estoque");
                cont = (int)Validacoes.num("\nDeseja continuar [1- Sim | 2 - Não]: ", 1, 2);
                if(cont == 2)
                    whileC = false;
                continue;
            }else
                qtd = (int)Validacoes.num("Informe a quantidade: ", 1, prod.getQuantidade());
            
            posi = -1;
            for(int i = 0; i < venda.size(); i++){
                fat = (Fatura) venda.elementAt(i);
                if(fat.getProduto().equalsIgnoreCase(prod.getNome()))
                   posi = i;
            }
            
            if(posi != -1){
                fat = (Fatura) venda.elementAt(posi);
                fat.setQuantidade(fat.getQuantidade()+qtd);
                fat.setSubtotal(fat.getSubtotal() + prod.getPreco()*qtd);
                venda.setElementAt(fat, posi);
                venda.trimToSize();
                preco = prod.getPreco()*qtd;
            }else{
                preco = prod.getPreco()*qtd;
                Fatura fatu = new Fatura(prod.getNome(),preco,qtd);
                venda.addElement(fatu);
                venda.trimToSize();
            }
            precoTotal += preco;
            
            cont = (int)Validacoes.num("\nDeseja continuar [1- Sim | 2 - Não]: ", 1, 2);
            
            if(cont == 2){
                whileC = false;
                if(!venda.isEmpty()){
                    finalizarPedido(precoTotal);
                }
            }
        }
        
    }
}
