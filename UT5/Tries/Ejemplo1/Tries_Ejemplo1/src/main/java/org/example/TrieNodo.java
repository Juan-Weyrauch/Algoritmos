package org.example;

public class TrieNodo {
  TrieNodo[] hijos;
  boolean esFinDePalabra;

  public TrieNodo(){
    hijos = new TrieNodo[26]; // De la a la z
    esFinDePalabra = false;
  }
}
