class OrdenacaoBubbleSort {

    // algorimo de ordenação com bubble sorte
    public static void bubblesort(int[] lista) {
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = 0; j < lista.length - 1 - i; j++) {
                if (lista[j] > lista[j + 1]) {
                    int aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                }
            }
        }
    }

    // algorimo de ordenação com bubble sorte recursivo
    public static void bubblesortRecursivo(int[] lista, int fim) {
        if (fim == 1) {
            return;
        }
        for (int i = 0; i < lista.length - 1; i++) {
            if (lista[i] > lista[i + 1]) {
                int aux = lista[i];
                lista[i] = lista[i + 1];
                lista[i + 1] = aux;
            }
            bubblesortRecursivo(lista, fim-1);
        }
    }

    // main
    public static void main(String[] args) {
        GeraLista gerar = new GeraLista();
        System.out.println("Teste 1");
        int[] idades = gerar.geraLista();
        bubblesort(idades);
        for (int i : idades) {
            System.out.print(i + ",");
        }


        System.out.println("\nTeste 2");
        int[] idades2 = gerar.geraLista();
        bubblesortRecursivo(idades2, idades2.length);
        for (int i : idades2) {
            System.out.print(i + ",");
        }
        System.out.println("\nFIM");

    }
}