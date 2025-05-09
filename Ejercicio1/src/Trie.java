import java.util.List;

public class Trie {
    private NodoTrie raiz;
    public Trie() {
        raiz = new NodoTrie();
    }
    public void insertar(Trie trie, String palabra, int pagina) {
        if (raiz == null) {
            raiz = new NodoTrie();
        }
        raiz.insertarRec(raiz, palabra, 0, pagina);
    }
    public void mostrarIndice() {
        if (raiz != null) {
            raiz.construirIndice(raiz, "");
        }
    }
}
