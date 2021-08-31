package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int totalDeNumeros = 10;
    int menorValor = 0;
    int maiorValor = 0;
    int contador = 2;

    System.out.println("Escolha 10 números aleatórios");
    System.out.println("Insira o 1º número: ");
    int valorEscolhido = leitor.nextInt();
    menorValor = valorEscolhido;
    maiorValor = valorEscolhido;

    while (contador <= totalDeNumeros) {
      System.out.println("Insira o " + contador + "º número: ");
      valorEscolhido = leitor.nextInt();
      contador++;
      if (valorEscolhido < menorValor){
        menorValor = valorEscolhido;
      }
      if (valorEscolhido > maiorValor){
        maiorValor = valorEscolhido;
      }



    }
    System.out.println("O menor número é: " + menorValor);
    System.out.println("O maior número é: " + maiorValor);
  }

}

