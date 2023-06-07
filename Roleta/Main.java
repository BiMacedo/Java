package Roleta;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    RoletaPremios roleta = new RoletaPremios();
    Scanner scanner = new Scanner(System.in);
    int opcao = -1;

    while (opcao != 0) {
        System.out.println("O que você deseja fazer?");
        System.out.println("1. Adicionar prêmio");
        System.out.println("2. Remover prêmio");
        System.out.println("3. Alterar prêmio");
        System.out.println("4. Ver total de prêmios na roleta");
        System.out.println("5. Ver prêmios na roleta");
        System.out.println("6. Rodar a roleta e sortear um prêmio");
        System.out.println("0. Sair");

        opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        switch (opcao) {
            case 1:
                System.out.println("Digite o nome do prêmio a ser adicionado:");
                String premioAdicionar = scanner.nextLine();
                roleta.adicionar(premioAdicionar);
                break;
            case 2:
                System.out.println("Digite o nome do prêmio a ser removido:");
                String premioRemover = scanner.nextLine();
                roleta.remover(premioRemover);
                break;
            case 3:
                System.out.println("Digite o nome do prêmio a ser alterado:");
                String premioAntigo = scanner.nextLine();
                System.out.println("Digite o novo nome do prêmio:");
                String premioNovo = scanner.nextLine();
                roleta.alterar(premioAntigo, premioNovo);
                break;
            case 4:
                int totalPremios = roleta.totalPremios();
                System.out.println("Total de prêmios na roleta: " + totalPremios);
                break;
            case 5:
                roleta.verPremio();
                break;
            case 6:
                roleta.rodar();
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

