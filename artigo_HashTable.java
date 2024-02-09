package com.mycompany.artigo_map_com_java;

import java.util.Hashtable;
import java.util.Map;
/**
 *
 * @author lucas
 */
public class artigo_HashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();

        // Adicionando elemento
        hashtable.put("chave1", 10);
        hashtable.put("chave2", 20);
        hashtable.put("chave3", 30);
        hashtable.put("chave4", 40);

        // Exibindo os elementos
        System.out.println("Elementos do Hashtable:");
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
}
