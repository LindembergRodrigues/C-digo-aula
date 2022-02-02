import java.util.Random;

public class GeraLista {
    public int[] geraLista(){
        Random r = new Random();
        int tamanho = r.nextInt(30);
        int [] lista = new int[tamanho];
        for(int i=0;i<tamanho;i++){
            lista[i]=r.nextInt(100);
        }

        return lista; 
    }
    
}
