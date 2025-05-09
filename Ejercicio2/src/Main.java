package org.example.UT5;

public class Main {
    public static void main(String[] args) {

        TArbolTrie trie = new TArbolTrie();
        trie.insertar("casa");
        trie.insertar("casamiento");
        trie.insertar("arbol");
        trie.insertar("grito");
        trie.imprimir();

        TArbolTrie trie2 = new TArbolTrie();

        String cadenas[] = ManejadorArchivosGenerico.leerArchivo("src/main/java/org/example/UT5/palabras.txt");
        for (int i = 0; i < cadenas.length; i++) {
            trie2.insertar(cadenas[i]);
        }

        System.out.println(trie2.buscar("programa")); // Está en trie (Devuelve 8)
        System.out.println(trie2.buscar("program")); // No está en trie (Devuelve -1)
        System.out.println(trie2.buscar("ala")); // Está en trie (Devuelve 3)
        System.out.println(trie2.buscar("cotonete")); // No está
        System.out.println(trie2.buscar("alabastro")); // Está y devuelve 9
        System.out.println(trie2.buscar("alabarro")); // Non estamus -> -1
        System.out.println(trie2.buscar("perro")); // Está -> 5
        System.out.println(trie2.buscar("perrosssssssss")); // No está -> -1
        System.out.println(trie2.buscar("pera")); // Está y devuelve 4
        System.out.println(trie2.buscar("peste")); // NOOOO -> Devuelve -1
    }
}
