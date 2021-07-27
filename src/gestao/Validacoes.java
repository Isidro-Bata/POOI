package gestao;
import java.io.*;
public class Validacoes {
    String msg = "\nDado invalido, informe dado valido: ";
    BufferedReader x;
    public Validacoes(){
        x = new BufferedReader(new InputStreamReader(System.in));
    }
      public String validaString() throws IOException{
        String nomee;
        do{
            nomee = x.readLine();
           if(nomee.length() < 1)
               System.out.print(msg);
           
        }while(nomee.length() < 1);
        return nomee;
    }
    public int validaInt() throws IOException{
        int nr;
        do{
          nr = Integer.parseInt(x.readLine());
          if(nr < 0)
            System.out.print(msg);  
          
        }while( nr < 0);
        return nr;
    }
   public float validaFloat() throws IOException{
        float nr;
        do{
          nr = Float.parseFloat(x.readLine());
          if(nr < 0.0)
            System.out.print(msg);
          
        }while( nr < 0.0);
        return nr;
    }
}
