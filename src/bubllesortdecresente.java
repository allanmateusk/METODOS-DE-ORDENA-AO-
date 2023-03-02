
public class bubllesortdecresente {
    public static void bubbleSort(String[] list){
    	
        for(int i=1; i<list.length; i++){
        	
            for(int j=0; j<list.length; j++){
            	if(list[i].compareTo(list[j].toUpperCase()) >0){
                    String temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
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

		bubbleSort(copia);

		System.out.print("\n\nVETOR ORDENADO\n\n");
		    for(int i=0; i<13; i++) {
		        System.out.printf("\n%s",copia[i]);
		    }
		    
	}

}