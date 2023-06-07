package Roleta;

public class RoletaPremios {
  Premio inicio;

  public RoletaPremios() {
      this.inicio = null;
  }

  public void adicionar(String premio) {
      Premio novoPremio = new Premio(premio);

      if (inicio == null) {
          novoPremio.proximo = novoPremio;
          novoPremio.anterior = novoPremio;
          inicio = novoPremio;
      } else {
          Premio ultimo = inicio.anterior;
          novoPremio.proximo = inicio;
          novoPremio.anterior = ultimo;
          inicio.anterior = novoPremio;
          ultimo.proximo = novoPremio;
      }

      System.out.println("Prêmio adicionado: " + premio);
  }

  public void remover(String premio) {
      if (inicio == null) {
          System.out.println("Não há prêmios na roleta.");
          return;
      }

      Premio atual = inicio;

      do {
          if (atual.nome.equals(premio)) {
              if (atual == inicio) {
                  if (atual.proximo == inicio) {
                      inicio = null;
                  } else {
                      inicio = atual.proximo;
                      atual.anterior.proximo = inicio;
                      inicio.anterior = atual.anterior;
                  }
              } else {
                  atual.anterior.proximo = atual.proximo;
                  atual.proximo.anterior = atual.anterior;
              }
              System.out.println("Prêmio removido: " + premio);
              return;
          }
          atual = atual.proximo;
      } while (atual != inicio);

      System.out.println("Prêmio não encontrado: " + premio);
  }

  public void alterar(String antigo, String novo) {
      if (inicio == null) {
          System.out.println("Não há prêmios na roleta.");
          return;
      }

      Premio atual = inicio;

      do {
          if (atual.nome.equals(antigo)) {
              atual.nome = novo;
              System.out.println("Prêmio alterado de " + antigo + " para " + novo);
              return;
          }
          atual = atual.proximo;
      } while (atual != inicio);

      System.out.println("Prêmio não encontrado: " + antigo);
  }

  public int totalPremios() {
      if (inicio == null) {
          return 0;
      }

      int contador = 0;
      Premio atual = inicio;

      do {
          contador++;
          atual = atual.proximo;
      } while (atual != inicio);

      return contador;
  }

  public void verPremio() {
      if (inicio == null) {
          System.out.println("Não há prêmios na roleta.");
          return;
      }

      Premio atual = inicio;

      do {
          System.out.println("Prêmio: " + atual.nome);
          atual = atual.proximo;
      } while (atual != inicio);
  }

  public String rodar() {
      if (inicio == null) {
          System.out.println("Não há prêmios na roleta.");
          return null;
      }

      int contador = (int) (Math.random() * Integer.MAX_VALUE);
      Premio premioSorteado = inicio;

      for (int i = 0; i < contador; i++) {
          premioSorteado = premioSorteado.proximo;
      }

      System.out.println("Prêmio sorteado: " + premioSorteado.nome);
      return premioSorteado.nome;
  }
}

