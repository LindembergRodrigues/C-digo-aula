public class OrdenacaoInsertion {
    public static void insertion(int [] lista){
        
        for (int i=1; i< lista.length;i++){
            int chave = lista[i];
            for (int j =i; j>0;j--){
                if (chave < lista[j-1]){
                    int aux = lista[j-1];
                    lista[j-1] = chave;
                    lista[j] = aux;
                }
            }
        }
    }

    public static void main (String [] args){
        int [] lista = {9,8,7,6,5,4,3,2,1};

        insertion(lista);
        for ( int i : lista){
            System.out.print(i + ", ");
        }
    }
}