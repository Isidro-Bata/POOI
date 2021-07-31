package gestao;

import java.io.*;

public class Validacoes {
    String msg = "Dado invalido, informe dado valido: ";
    BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
    
    public Validacoes(){}
    
    public double num(String t, int i, int f) {
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
    
    public String texto(String t, int mTam) {
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
}
