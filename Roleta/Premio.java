package Roleta;

public class Premio {
  String nome;
  Premio proximo;
  Premio anterior;

  public Premio(String nome) {
      this.nome = nome;
      this.proximo = null;
      this.anterior = null;
}
}