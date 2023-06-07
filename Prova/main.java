package Prova;
import java.util.ArrayList;
import java.util.Scanner;

public class main{
public static void main(String[] args) {
        TreinoFuncional treino = new TreinoFuncional();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("O que você deseja fazer?");
            System.out.println("1. Adicionar Exercício");
            System.out.println("2. Próximo Exercício");
            System.out.println("3. Exibir Exercícios");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do exercício:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o número de repetições:");
                    int repeticoes = scanner.nextInt();
                    scanner.nextLine(); 

                    treino.adicionar(new exercicios(nome, repeticoes));
                    break;
                case 2:
                    treino.proximo();
                    break;
                case 3:
                    treino.exibir();
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
