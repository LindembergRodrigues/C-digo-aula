import java.util.Random;

public class GeraListaOrdenada {
    public int[] geraLista(){
        Random r = new Random();
        int tamanho = r.nextInt(100);
        int [] lista = new int[tamanho];
        for(int i=0;i<tamanho;i++){
            lista[i]=r.nextInt(1000);
        }

        return lista; 
    }
    
}
