/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracao;

import entidade.*;
import java.util.*;
import static gestao.Menu.*;


public class Verificar {
     public static void viewFuncionario() {
        Funcionario func;
        for(int i=0;i<funcionarios.size();i++) {
             func = (Funcionario) funcionarios.elementAt(i);
             System.out.println(func.toString());
        }
     }
     
     public static void viewFornecedor() {
         
     }
     
     public static void viewStock() {
         
     }
}
