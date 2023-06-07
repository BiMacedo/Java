package Email;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
public static void main(String[] args) {
  SistemaLogin sistema = new SistemaLogin();
  Scanner scanner = new Scanner(System.in);
  int opcao = -1;

  while (opcao != 0) {
      System.out.println("O que você deseja fazer?");
      System.out.println("1. Criar conta");
      System.out.println("2. Login");
      System.out.println("0. Sair");

      opcao = scanner.nextInt();
      scanner.nextLine(); // Limpar o buffer do scanner

      switch (opcao) {
          case 1:
              System.out.println("Email:");
              String email = scanner.nextLine();
              System.out.println("Senha:");
              String senha = scanner.nextLine();
              sistema.criarConta(email, senha);
              break;
          case 2:
              System.out.println("Email:");
              email = scanner.nextLine();
              System.out.println("Senha:");
              senha = scanner.nextLine();
              sistema.realizarLogin(email, senha);
              break;
          case 0:
              System.out.println("Encerrando o programa.");
              break;
          default:
              System.out.println("Opção inválida. Digite novamente.");
              break;
      }
  }

  scanner.close();
} 
}