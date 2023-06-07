package Fila;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        PilhaDocumentos pilha = new PilhaDocumentos();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("O que você deseja fazer?");
            System.out.println("1. Adicionar documento");
            System.out.println("2. Assinar documento");
            System.out.println("3. Exibir documentos");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.println("Digite o título do documento:");
                    String titulo = scanner.nextLine();
                    Documento novoDocumento = new Documento(titulo);
                    pilha.adicionar(novoDocumento);
                    break;
                case 2:
                    Documento documentoAssinado = pilha.assinar();
                    if (documentoAssinado != null) {
                        System.out.println("Documento assinado: " + documentoAssinado.getTitulo());
                    }
                    break;
                case 3:
                    pilha.exibir();
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


