package com.mycompany.artigo_map_com_java;

import java.util.LinkedHashMap;
import java.util.Map;
/**
 *
 * @author lucas
 */
public class artigo_LinkedHashMap {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();

        // Adicionando elementos
        linkedHashMap.put("chave1", 10);
        linkedHashMap.put("chave2", 20);
        linkedHashMap.put("chave3", 30);
        linkedHashMap.put("chave4", 40);

        // Exibindo os elementos
        System.out.println("Elementos do LinkedHashMap:");
        for (String chave : linkedHashMap.keySet()) {
            System.out.println("Chave: " + chave + ", Valor: " + linkedHashMap.get(chave));
        }

    }
}
