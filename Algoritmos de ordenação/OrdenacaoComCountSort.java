import java.util.Random;

public class OrdenacaoComCountSort {
    public static void main(String[] args) {
        Random rand = new Random();

        int quantidade = rand.nextInt(1000);
        System.out.println(quantidade);
        int[] lista = new int[150];
        int []listaAux = new int[150];
        for (int i = 0; i < 150; i++) {
            lista[i] = rand.nextInt(1000);
        }
        
        countSort(lista, listaAux,1000);
        for (int i : listaAux) {System.out.print(i+", ");}
        System.out.println();
    }

    public static void countSort(int[] lista, int[] listaAux, int maior) {
        int[] sort = new int[maior + 1];

        for (int i = 0; i < lista.length; i++) {
            sort[lista[i]]++;
        }

        int controle = 0;
        int aux = 0;
        while (aux < listaAux.length) {
            if (sort[controle]!= 0) { 
                listaAux[aux] = controle;
                aux++;
                sort[controle]--;
            }else{
                controle++;
            }
        }
        

    }

}

