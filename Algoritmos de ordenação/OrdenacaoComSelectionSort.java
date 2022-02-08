public class OrdenacaoComSelectionSort {
    public static void main(String[] args) {
        int[] lista = { 9, 8, 6, 5, 4, 73, 0 };
        quickSort(lista, 0, lista.length);
        for ( int i: lista ) {
            System.out.println(i);
        }
    }

    public static void quickSort(int[] lista, int left, int right) {
        if (left < right) {
            int pivo = partition(lista, left, right);
            quickSort(lista, left, pivo - 1);
            quickSort(lista, pivo + 1, right);
        }
    }

    public static int partition(int[] lista, int left, int right) {
        int pivo = lista[left];
        int j = left;
        for (int i = j; i < right; i++) {
            if (lista[i] < pivo) {
                j++;
                int aux = lista[j];
                lista[j] = lista[i];
                lista[i] = aux;
            }
        }
        int aux = lista[left];
        lista[left] = lista[j];
        lista[j] = aux;

        return j;
    }
}