package Fila;

public class PilhaDocumentos {
  private Documento[] documentos;
  private int tamanho;

  public PilhaDocumentos() {
      documentos = new Documento[5];
      tamanho = 0;
  }

  public void adicionar(Documento doc) {
      if (tamanho == documentos.length) {
          dobrarCapacidade();
      }

      documentos[tamanho] = doc;
      tamanho++;
      System.out.println("Documento adicionado à pilha: " + doc.getTitulo());
  }

  public Documento assinar() {
      if (tamanho == 0) {
          System.out.println("Não há documentos restantes para assinar.");
          return null;
      } else {
          Documento documentoAssinado = documentos[tamanho - 1];
          documentoAssinado.assinar();
          tamanho--;
          System.out.println("Documento assinado e removido da pilha: " + documentoAssinado.getTitulo());
          return documentoAssinado;
      }
  }

  public void exibir() {
      System.out.println("Documentos restantes na pilha:");
      for (int i = tamanho - 1; i >= 0; i--) {
          System.out.println(documentos[i].getTitulo());
      }
  }

  private void dobrarCapacidade() {
      Documento[] novaCapacidade = new Documento[documentos.length * 2];
      System.arraycopy(documentos, 0, novaCapacidade, 0, tamanho);
      documentos = novaCapacidade;
      System.out.println("Capacidade da pilha dobrada: " + documentos.length);
  }
}