package br.com.zup;

import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Por favor, digite a quantidade de números a serem analisados:");
    int numeroLido = leitor.nextInt();

    int contador = 1;
    int numeroEscolhido = 0;
    int soma = 0;
    int media = 0;


    while (contador <= numeroLido){
      System.out.println("Digite o número escolhido: ");
      numeroEscolhido = leitor.nextInt();
      contador++;
      soma = soma+numeroEscolhido;
      media = soma/numeroLido;


    }
    System.out.println(soma);
    System.out.println("A média da soma dos números escolhidos é: "  + media);
  }
}
