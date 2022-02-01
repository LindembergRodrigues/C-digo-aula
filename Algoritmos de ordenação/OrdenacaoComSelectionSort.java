public class OrdenacaoComSelectionSort {
    public static void selectionSort(int[] lista) {
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[j] < lista[i]) {
                    int aux = lista[j];
                    lista[j] = lista[i];
                    lista[i] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        GeraListaOrdenada gerar = new GeraListaOrdenada();
        int [] lista = gerar.geraLista();
        for (int i : lista) {
            System.out.print(i + ", ");
        }
        System.out.println("\nTeste 2");
        selectionSort(lista);
        for (int i : lista) {
            System.out.print(i + ", ");
        }
        System.out.println("\nFim");
    }
}
