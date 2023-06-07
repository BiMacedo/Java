package Email;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaLogin {
    private Map<String, String> contas;

    public SistemaLogin() {
        contas = new HashMap<>();
    }

    public void criarConta(String email, String senha) {
        contas.put(email, senha);
        System.out.println("Conta criada com sucesso!");
    }

    public boolean realizarLogin(String email, String senha) {
        String senhaArmazenada = contas.get(email);
        if (senhaArmazenada != null && senhaArmazenada.equals(senha)) {
            System.out.println("Login realizado com sucesso!");
            return true;
        } else {
            System.out.println("Email ou senha incorretos. Tente novamente.");
            return false;
        }
    }
  }
 