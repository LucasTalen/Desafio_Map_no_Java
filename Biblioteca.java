package com.mycompany.artigo_map_com_java;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author lucas
 */
public class Biblioteca {
    private Map<String, Livro> catalogo;

    public Biblioteca() {
        this.catalogo = new HashMap<String, Livro>();
    }

    public void adicionarLivro(String titulo, Livro livro) {
        catalogo.put(titulo, livro);
    }

    public Livro buscarLivro(String titulo) {
        return catalogo.get(titulo);
    }

    public void exibirCatalogo() {
        System.out.println("Catálogo da Biblioteca:\n------------------------");
        for (Map.Entry<String, Livro> entry : catalogo.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros
        biblioteca.adicionarLivro("A arte da guerra", new Livro("A arte da guerra", "Sun Tzu"));
        biblioteca.adicionarLivro("A princesa salva a si mesma neste livro", new Livro("A princesa salva a si mesma neste livro", "Amanda Lovelace"));
        biblioteca.adicionarLivro("A divina comedia - O inferno", new Livro("A divina comedia - O inferno", "Dante alighieri"));

        // Exibindo catálogo
        biblioteca.exibirCatalogo();

        // Buscando livro
        Livro livro = biblioteca.buscarLivro("A arte da guerra");
        if (livro != null) {
            System.out.println("Livro encontrado: " + livro);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}

class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return titulo + " por " + autor;
    }
}


