package org.example;

public class Trie {
  private TrieNodo raiz;

  public Trie(){
    raiz = new TrieNodo();
  }

  public void insertar(String palabra) {
    TrieNodo nodo = raiz;
    for (char letra : palabra.toCharArray()) {  // goooooooogle
        int indice = letra - 'a'; // this is bc char 'a' has a value of 97.
        if (nodo.hijos[indice] == null){
          nodo.hijos[indice] = new TrieNodo();
        }
        nodo = nodo.hijos[indice];
    } 

    nodo.esFinDePalabra = true;
  }

  public boolean buscar(String palabra) {
    TrieNodo nodo = raiz;
    for (char letra : palabra.toCharArray()) {
      int indice = letra - 'a';
      if (nodo.hijos[indice] == null){
        return false;
      }
      nodo = nodo.hijos[indice];
    }
    return nodo.esFinDePalabra;
  }

  public boolean empiezaCon(String prefijo) {
    TrieNodo nodo = raiz;
    for (char letra : prefijo.toCharArray()) {
      int indice = letra - 'a';
      if (nodo.hijos[indice] == null) {
        return false;
      }
      nodo = nodo.hijos[indice];
    }
    return true;
  }
}
