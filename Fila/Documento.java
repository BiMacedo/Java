package Fila;

public class Documento {
  private String titulo;
  private boolean assinado;

  public Documento(String titulo) {
      this.titulo = titulo;
      this.assinado = false;
  }

  public String getTitulo() {
      return titulo;
  }

  public boolean isAssinado() {
      return assinado;
  }

  public void assinar() {
      this.assinado = true;
  }
}
