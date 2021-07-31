package gestao;

import java.io.*;
import java.util.Vector;

public class LeituraEscrita {
    public static void write(String fich, Vector p) {
        try {
            FileOutputStream dataFile = new FileOutputStream(fich);
            ObjectOutputStream escrita = new ObjectOutputStream(dataFile);
            escrita.writeObject(p);
            escrita.close();
        } catch(IOException Erro) { System.out.println("Ficheiro nao existe"); }
    }
    
    public static Vector read(String fich) {
        Vector p;
        try {
            FileInputStream dataFile = new FileInputStream(fich);
            ObjectInputStream ler = new ObjectInputStream(dataFile);
            p = (Vector) ler.readObject();
            ler.close();
            return p; 
        } catch( Exception E) { System.out.println("Ficheiro nao existe"); }
        return new Vector();
    }
}
