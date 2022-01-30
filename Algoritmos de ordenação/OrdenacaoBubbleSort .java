class OrdenacaoBubbleSort{

// algorimo de ordenação com bubble sorte 
public static void bubblesort(int [] lista){
    for (int i =0; i< lista.length-1 ; i++){
        for ( int j = 0; j<lista.length-1-i; j++){
            if (lista[j] > lista[j+1]){
                int aux = lista[j];
                lista[j] = lista[j+1];
                lista[j+1]= aux;                
            }
        }
    }
}


// algorimo de ordenação com bubble sorte recursivo
public static void bubblesortRecursivo(int [] lista){
    for (int i =0; i< lista.length-1 ; i++){
        for ( int j = 0; j<lista.length-1-i; j++){
            if (lista[j] > lista[j+1]){
                int aux = lista[j];
                lista[j] = lista[j+1];
                lista[j+1]= aux;                
            }
        }
    }
}

// main
    public static void main(String [] args ){
        int [] idades = {9,8,7,6,5,4,3,2,1};
        bubblesort(idades);
        for (int i: idades){
            System.out.print(i+",");
        }

    }
}