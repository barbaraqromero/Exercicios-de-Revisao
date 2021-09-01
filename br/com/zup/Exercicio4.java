package br.com.zup;

import java.util.Scanner;

public class Exercicio4 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite a quantidade de números desejada para análise:");
    int numeroLido = leitor.nextInt();

    int contador = 1;
    int soma = 0;

    while (contador <= numeroLido){
      System.out.println("Digite o " + contador + "º número");
      int numeroEscolhido = leitor.nextInt();
      soma = soma + numeroEscolhido;
      contador++;
    }
    System.out.println("A soma dos números escolhidos é " + soma);
  }
}
