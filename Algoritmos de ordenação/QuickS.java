public class QuickS{
	public static void main(String[] args){
    int[] vetor ={27,39824,430,4,3,249,0};
    mostraVetor(vetor);
    quickSort(vetor);
    mostraVetor(vetor);
}

public static int separa(int [] vetor, int inicio, int fim)
{
    int pivo = vetor[inicio];
    int indice = inicio;

    for (int i = inicio; i <= fim; i++)
    {
        if (vetor[i] < pivo)
        {
            indice++;
            int temp = vetor[i];
            vetor[i] = vetor[indice];
            vetor[indice] = temp;
            
        }
    }

    if (pivo >= vetor[indice])
    {
        vetor[inicio] = vetor[indice];
        vetor[indice] = pivo;
    }

    return indice;
}

public static void quickSort(int [] vetor, int inicio, int fim)
{
    if (inicio < fim)
    {
        int pivo = separa(vetor, inicio, fim);
        quickSort(vetor, inicio, pivo-1);
        quickSort(vetor, pivo+1, fim);
    }
}

public static void quickSort(int[] vetor)
{
    quickSort(vetor, 0, vetor.length-1);
}

public static void mostraVetor(int[] vetor){
    for (int i = 0; i < vetor.length; i++){
			System.out.print(vetor[i]+" ");
    }
	System.out.println("");
}


}