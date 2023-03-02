public class HeapSort {
    static int x = -1;
		 
	static String []heap = new String[1000];
		 
	static void heapForm(String k){
		x++;
		heap[x] = k;
		int child = x;
		String tmp;
		int index = x / 2;
		
		while (index >= 0){
			if (heap[index].compareTo(heap[child]) > 0){
				tmp = heap[index];
		        heap[index] = heap[child];
		        heap[child] = tmp;
		        child = index;
		        index = index / 2;
			} else {
				break;
				}
		 }
	}
	
	static void heapSort(){
		int left1, right1;
		
		System.out.print("\n\nVETOR ORDENADO\n\n");
		
		while (x >= 0){
			String k;
		    k = heap[0];
		    System.out.print(k + "\n");
		    heap[0] = heap[x];
		    x = x - 1;
		 
		    String tmp;
		    int index = 0;
		    int length = x;
		    left1 = 1;
		    right1 = left1 + 1;
	
		    while (left1 <= length){
		    	if (heap[index].compareTo(heap[left1]) <= 0 && heap[index].compareTo(heap[right1]) <= 0){
		    		break;
		        } else {
		        	if (heap[left1].compareTo(heap[right1])< 0){
		        		tmp = heap[index];
		                heap[index] = heap[left1];
		                heap[left1] = tmp;
		                index = left1;
		            } else {
		            	tmp = heap[index];
		                heap[index] = heap[right1];
		                heap[right1] = tmp;
		                index = right1;
		              }
		          }
		    	
		    	left1 = 2 * left1;
		        right1 = left1 + 1;
		        
		      }
		 }
	}
		 
		static void sort(String k[]){
		    for (int i = 0; i < 13; i++){
		        heapForm(k[i]);
		    }
		    
		    heapSort();
		    
		}

    public static void swap(String[] arr, int j, int iMin) {
        String temp = arr[j];
        arr[j] = arr[iMin];
        arr[iMin] = temp;
    }

	public static void main(String[] args) {
		
		String nome[] = new String [13];
	    String copyvetor[] = new String [13];

		
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
			copyvetor[i] = nome[i];
		}

		sort(copyvetor);
		    
	}

}

