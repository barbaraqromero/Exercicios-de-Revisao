package br.com.zup;

public class Exercicio5 {
  public static void main(String[] args) {
    int contador = 0;

    while (contador <= 100000) {
      System.out.println(contador);
      contador = contador + 1000;
    }
  }
}