public class Selectsortdecresente {
    public static void selectionSort(String[] vet) {
        int size = vet.length;
        for (int i = 0; i < size - 1; i++) {
            int iMin = i;
            for (int j = i + 1; j < size; j++) {
                if (vet[i].compareTo(vet[j].toUpperCase()) <0) {
                    swap(vet, j, iMin);
                }
            }
        }
    }

    public static void swap(String[] vet, int j, int iMin) {
        String temp = vet[j];
        vet[j] = vet[iMin];
        vet[iMin] = temp;
    }

	public static void main(String[] args) {
		
		String nome[] = new String [13];
	    String copia[] = new String [13];

		
		nome[0] = "Ana Maria Silva";
		nome[1] = "Silvana Braga";
		nome[2] = "Amanda de Sa";
		nome[3] = "Gustavo Reis";
		nome[4] = "Zozimo Pereira";
		nome[5] = "Breno Duarte";
		nome[6] = "Maria Jose";
		nome[7] = "Ana Julia Miranda";
		nome[8] = "Joaquim dos Santos";
		nome[9] = "Meire Aparecida da Silva";
		nome[10] = "Antonio Gomes";
		nome[11] = "Ana Maria Sousa";
		nome[12] = "Jose Maria";
		
		for(int i=0; i<13; i++) {
			nome[i] = nome[i].toUpperCase();
		}
		
		for(int i=0; i<13; i++) {
			System.out.printf("\n%s",nome[i]);
		}
		
		for(int i=0; i<13; i++) {
			copia[i] = nome[i];
		}

		selectionSort(copia);

		System.out.print("\n\nVETOR ORDENADO\n\n");
		    for(int i=0; i<13; i++) {
		        System.out.printf("\n%s",copia[i]);
		    }
		    
	}

}