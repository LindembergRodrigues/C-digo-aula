public class OrdenacaoComMergeSort {
    public void  mergesort(int [] lista, int inicio, int fim){
        if (lista.length==1){
            return;
        }
        mergesort(lista,0,lista.length/2);
        mergesort(lista,lista.length/2+1, lista.length);
        merge(lista, inicio,lista.length/2, lista.length);
    }

    public void merge(int [] lista, int inicio, int meio, int fim){
        
    }
}

