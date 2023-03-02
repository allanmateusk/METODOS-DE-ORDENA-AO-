public class MergeSortdecresente {
    
    public static void mergeSort(String[] a, int from, int to) {
        if (from == to) {
            return;
        }
        int mid = (from + to) / 2;

        mergeSort(a, from, mid);
        mergeSort(a, mid + 1, to);
        merge(a, from, mid, to);
    }

    public static void merge(String[] a, int from, int mid, int to) {
        int n = to - from + 1;       
        String[] b = new String[n];   
        int i1 = from;               
        int i2 = mid + 1;            
        int j = 0;                   
        
        while (i1 <= mid && i2 <= to) {
            if (a[i1].compareTo(a[i2]) > 0) {
                b[j] = a[i1];
                i1++;
            } else {
                b[j] = a[i2];
                i2++;
            }
            j++;
        }

        while (i1 <= mid) {
            b[j] = a[i1];
            i1++;
            j++;
        }

        while (i2 <= to) {
            b[j] = a[i2];
            i2++;
            j++;
        }

        for (j = 0; j < n; j++) {
            a[from + j] = b[j];
        }
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

		mergeSort(copia, 0, copia.length - 1);

		System.out.print("\n\nVETOR ORDENADO\n\n");
		    for(int i=0; i<13; i++) {
		        System.out.printf("\n%s",copia[i]);
		    }
		    
	}

}
