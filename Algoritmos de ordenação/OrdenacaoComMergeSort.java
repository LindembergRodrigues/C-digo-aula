public class OrdenacaoComMergeSort {
	public static void main(String[] args) {
		GeraLista g = new GeraLista();
        int[] vetor = g.geraLista();
		merge(vetor,0, vetor.length - 1);
		for (int i : vetor) {
			System.out.println(i);
		}
	}

	public static void merge(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			merge(vetor, inicio, meio);
			merge(vetor, meio + 1, fim);
			merge2(vetor, inicio, meio, fim);
		}
	}

	public static void merge2(int[] vetor, int inicio, int meio, int fim) {
		int[] Aux = new int[vetor.length];
		for(int i = inicio; i <= fim; i++){
			Aux[i] = vetor[i];}
		
		int i = inicio;
		int j = meio+1;
		int k = inicio;
		
		while(i <= meio && j <= fim) {
			if(Aux[i] < Aux[j]) {
				vetor[k] = Aux[i];
				i++;
			}else{
				vetor[k] = Aux[j];
				j++;
			}
			k++;
		}
		
		while(i <= meio) {
			vetor[k] = Aux[i];
			i++;
			k++;
		}
		
		while(j <= fim) {
			vetor[k] = Aux[j];
			j++;
			k++;
		}
}}