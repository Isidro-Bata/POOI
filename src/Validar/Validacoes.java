package Validar;

import java.io.*;
import static gestao.Menu.*;
import entidade.*;


public class Validacoes {
    private static String msg = "Dado invalido, informe dado valido: ";
    private static BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
    
    public Validacoes(){}
    
    public static double num(String t, int i, int f) {
        double n=0;
        do {
            System.out.print(t);
            try {
                n = Double.parseDouble(x.readLine());
            } catch(NumberFormatException e) {
                System.out.println(e.getMessage());
            }catch(IOException io) {
                System.out.println(io.getMessage());
            }
            if(n < i || n > f)
                System.out.println(msg);
        }while(n < i || n > f);
        return n;
    }
    
    public static String texto(String t, int mTam) {
        String txt = "";
        do {
            System.out.print(t);
            try {
                txt = x.readLine();
            }catch(IOException io){
                System.out.println(io.getMessage());
            }
            if(txt.isEmpty() || txt.length() < mTam)
                System.out.println(msg);
        }while(txt.isEmpty() || txt.length() < mTam);
        return txt;
    }
    
    public static int verificarCat(int id) {
        Categoria cat;
        int pos = -1;
        for(int i=0;i<categoria.size();i++) {
            cat = (Categoria) categoria.elementAt(i);
            if(cat.getIdCategoria() == id)
                pos = i;
        }
        return pos;
    }
    
    public static int verificarProd(int id) {
        Produto prod;
        int pos = -1;
        for(int i=0;i<produto.size();i++) {
            prod = (Produto) produto.elementAt(i);
            if(prod.getId() == id)
                pos = i;
        }
        return pos;
    }
}
