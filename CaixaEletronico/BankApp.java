package CaixaEletronico;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankApp {
    private static Map<String, Account> accounts = new HashMap<>();
    private static Account currentAccount;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("1. Criar conta");
            System.out.println("2. Login");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consumes the newline character

            switch (option) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    login();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("Encerrando o aplicativo.");
    }

    private static void createAccount() {
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String password = scanner.nextLine();

        if (accounts.containsKey(email)) {
            System.out.println("Já existe uma conta com esse email.");
        } else {
            Account account = new Account(email, password);
            accounts.put(email, account);
            System.out.println("Conta criada com sucesso!");
        }
    }

    private static void login() {
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String password = scanner.nextLine();

        if (accounts.containsKey(email)) {
            Account account = accounts.get(email);
            if (account.getPassword().equals(password)) {
                currentAccount = account;
                System.out.println("Login realizado com sucesso!");
                showAccountMenu();
            } else {
                System.out.println("Senha incorreta.");
            }
        } else {
            System.out.println("Nenhuma conta encontrada com esse email.");
        }
    }

    private static void showAccountMenu() {
        boolean loggedIn = true;
        while (loggedIn) {
            System.out.println("1. Sacar");
            System.out.println("2. Depositar");
            System.out.println("3. Ver saldo");
            System.out.println("4. PIX");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consumes the newline character

            switch (option) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    showBalance();
                    break;
                case 4:
                    makePix();
                    break;
                case 0:
                    loggedIn = false;
                    currentAccount = null; // Logout the current account
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void withdraw() {
        System.out.print("Qual valor deseja sacar: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consumes the newline character

        if (currentAccount.withdraw(amount)) {
            System.out.println("Saque feito com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }

        System.out.println("Seu saldo é de R$ " + currentAccount.getBalance());
    }

    private static void deposit() {
        System.out.print("Qual valor deseja depositar: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consumes the newline character

        currentAccount.deposit(amount);
        System.out.println("Depósito feito com sucesso!");
        System.out.println("Seu saldo é de R$ " + currentAccount.getBalance());
    }

    private static void showBalance() {
        System.out.println("Seu saldo é de R$ " + currentAccount.getBalance());
    }

    private static void makePix() {
        System.out.println("Opção PIX selecionada.");
        // Implementar a lógica do PIX aqui, se necessário
    }
}