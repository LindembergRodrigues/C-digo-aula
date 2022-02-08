public class OrdenacaoComQuickSort {
    public static void main(String[] args){
        GeraLista gerar = new GeraLista();
        int[] ok = gerar.geraLista();
        for (int i: ok){
            System.out.print(i+" ,");
        }
        System.out.println("------------");
        quickSort(ok,0,ok.length);
        for (int i: ok){
            System.out.print(i+" ,");
        }
    }

    public static void quickSort(int[] lista, int left, int right) {
        if (left < right) {
            int pivo = partition(lista,left,right);
            quickSort(lista, left, pivo);
            quickSort(lista,pivo+1,right);
        }
    }

    public static int partition(int[] lista,int left, int right) {
        int pivo = lista[left];
        int i=left;
        for (int j = i; j < right; j++) {
            if (lista[j] < pivo) {
                i++;
                int aux = lista[i];
                lista[i] = lista[j];
                lista[j] = aux;
            }
        }
        int aux = lista[left];
        lista[left] = lista[i];
        lista[i] = aux;
        return i;
    }    
}
