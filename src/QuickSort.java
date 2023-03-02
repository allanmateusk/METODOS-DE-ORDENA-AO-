public class QuickSort {
    private static void quickSort(String[] a, int start, int end){
		
		int i = start;
        int j = end;

        if (j - i >= 1){
        	String pivot = a[i];
        	
        	while (j > i){
        		while (a[i].compareTo(pivot) <= 0 && i < end && j > i){
        			i++;
        		}
        		while (a[j].compareTo(pivot) >= 0 && j > start && j >= i){
        			j--;
        		}
        		
        		if (j > i)
        			swap(a, i, j);
                }
        	
        	swap(a, start, j);
        	quickSort(a, start, j - 1);
        	quickSort(a, j + 1, end);
            }
        }

	private static void swap(String[] a, int i, int j){
		String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
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

		quickSort(copia, 0, copia.length -1);

		System.out.print("\n\nVETOR ORDENADO\n\n");
		    for(int i=0; i<13; i++) {
		        System.out.printf("\n%s",copia[i]);
		    }
		    
	}

}
