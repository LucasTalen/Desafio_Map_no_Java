
package com.mycompany.artigo_map_com_java;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author lucas
 */
public class Artigo_map_com_java {

    public static void main(String[] args) {
           Map<String, Integer> mapa = new HashMap<String, Integer>();

           // Adicionando elementos
           mapa.put("chave1", 10);
           mapa.put("chave2", 20);
           mapa.put("chave3", 30);
           mapa.put("chave1", 40); // Isso irá substituir o valor associado à chave 'chave1'
   
           // Acessando e exibindo
           System.out.println("Valor associado à chave 'chave1': " + mapa.get("chave1"));
           System.out.println("Valor associado à chave 'chave2': " + mapa.get("chave2"));
           System.out.println("Valor associado à chave 'chave3': " + mapa.get("chave3"));
   
           // Exibindo os elementos
           System.out.println("Elementos do HashMap:");
           for (String chave : mapa.keySet()) {
               System.out.println("Chave: " + chave + ", Valor: " + mapa.get(chave));
           }
       
    }
}
