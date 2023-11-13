package exercicio_univesp;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExemploRuntimeException {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Entre com um número inteiro: ");
    try {
      int numero = s.nextInt();
      System.out.println("Número lido: " + numero);
    } catch (InputMismatchException e) {
      System.out.println("Erro: você deve inserir um número inteiro.");
    }
  }
}
