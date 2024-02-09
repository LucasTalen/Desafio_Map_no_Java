package com.mycompany.artigo_map_com_java;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author lucas
 */
public class artigo_TreeMap {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<String, Integer>();

        // Adicionando elementos
        treeMap.put("chave3", 30);
        treeMap.put("chave1", 10);
        treeMap.put("chave4", 40);
        treeMap.put("chave2", 20);

        // Exibindo os elementos
        System.out.println("Elementos do TreeMap:");
        for (String chave : treeMap.keySet()) {
            System.out.println("Chave: " + chave + ", Valor: " + treeMap.get(chave));
        }
    }
}
