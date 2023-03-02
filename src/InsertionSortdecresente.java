public class InsertionSortdecresente {
    public static boolean insertionSort(String a []) {
        if (a == null) return false;
        int i,j;  String x;
        for (j = 1; j < a.length; j++) {
            x = a[j]; i = j - 1;

            while (i >= 0) {
                if (x.compareTo(a[i]) < 0) {
                    break;
                }
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = x;

        }
        return true;
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

		insertionSort(copia);

		System.out.print("\n\nVETOR ORDENADO\n\n");
		    for(int i=0; i<13; i++) {
		        System.out.printf("\n%s",copia[i]);
		    }
		    
	}

}