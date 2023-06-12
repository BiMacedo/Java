package ListItem;

public class Main{
public static void main(String[] args) {
        ListItem list = new ListItem();

        // Adicionar elementos à lista
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Imprimir o tamanho da lista
        System.out.println("Tamanho da lista: " + list.size());

        // Imprimir todos os elementos da lista
        System.out.println("Elementos da lista:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Elemento " + i + ": " + list.get(i));
        }

        // Remover o elemento na posição 2
        int removedValue = list.remove(2);
        System.out.println("Elemento removido: " + removedValue);

        // Imprimir todos os elementos da lista após a remoção
        System.out.println("Elementos da lista após a remoção:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Elemento " + i + ": " + list.get(i));
        }

        // Verificar se a lista contém o valor 40
        boolean containsValue = list.contains(40);
        System.out.println("A lista contém o valor 40? " + containsValue);

        // Alterar o valor do elemento na posição 1 para 100
        boolean setValueSuccess = list.set(1, 100);
        System.out.println("Alteração de valor bem-sucedida? " + setValueSuccess);

        // Imprimir todos os elementos da lista após a alteração de valor
        System.out.println("Elementos da lista após a alteração de valor:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Elemento " + i + ": " + list.get(i));
        }

        // Limpar a lista
        list.clear();
        System.out.println("Tamanho da lista após limpeza: " + list.size());
    }
}