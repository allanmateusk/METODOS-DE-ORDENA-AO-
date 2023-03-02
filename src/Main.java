import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int notaProcurar;
		int nota;
		int [] vetorNotasQ1 = {10, 15, 50, 35, 27};
		System.out.println("nota para procurar: ");
		nota=sc.nextInt();
		boolean q1 = encontrarNota(nota, vetorNotasQ1);
		if(q1 == false) {
			System.out.println("Questão 1 " + "nota não encontrada");
		}
		boolean q3 = buscarBinariaq3(vetorNotasQ1, nota);
		if(q3 == false) {
			System.out.println("Questão 3 " + "nota não encontrada");
		}
		
		int [] vetorq5 = new int [120];
		vetorq5 = cadastrarNotas(vetorq5);
		System.out.println("nota para procurar: ");
		notaProcurar = sc.nextInt(); 
		System.out.println( buscarBinaria(vetorq5, notaProcurar )); 
		System.out.println(buscar(vetorq5, notaProcurar)); 
		
		
		
		

	}
	/* Q1*/
	static boolean encontrarNota(int nota, int [] vetorNotas) {
		boolean result = false;
		for(int i=0; i<vetorNotas.length; i++) {
			if(nota == vetorNotas[i]) {
				System.out.println("Questão 1, pesquisa sequencial, " + "nota armazenada no indice: " +i);
				result = true;
			}
		}
		return result;
	}
	
	/*
	  	Q2) 	 R: Melhor caso: f(n) = 1 = Θ(1)
     			Pior caso: f(n) = n = Θ(n)
     			Caso médio: f(n) = (n + 1) =  Θ(n)
                                        2
		Q3) ORDENANDO VETOR E CRIANDO ALGORITMO DE BUSCA BINARIA.
		
	 */
	/* Q4*/
	static boolean buscarBinariaq3( int [] vetorNotas, int nota) {
		boolean result = false;
		
		int inicio = 0;
		int meio;
		int fim = vetorNotas.length-1;
		
		while(inicio <= fim)
		{
			meio=(inicio + fim) / 2;

			if(vetorNotas[meio] < nota)
				inicio = meio + 1;
			else if (vetorNotas[meio]> nota)
				fim = meio - 1;
			else {
				System.out.println("Questão 3, pesquisa binaria, " + "nota armazenada no indice: " + meio);
			    result = true;
			    inicio = vetorNotas.length;
			    }
		}

		return result; 
		
	
	}
	/* Q5*/
	
	static int [] cadastrarNotas(int [] vetorNotas) {
		Random r = new Random();
		vetorNotas = new int [120];
		
		for(int i=0; i<vetorNotas.length; i++) {
			vetorNotas[i] = r.nextInt(100);	
		}
	return vetorNotas;
	}
	
	static int [] bubbleSort(int [] vetorNotas) {
		int aux;
		for(int i = 0; i < vetorNotas.length-1; i++){
            for(int j = i + 1; j < vetorNotas.length; j++){
                if(vetorNotas[i] > vetorNotas[j]){
                    aux = vetorNotas[i];
                    vetorNotas[i] = vetorNotas[j];
                    vetorNotas[j] = aux;
                }
            }
            
         }
	return vetorNotas;
	}
	static int buscar(int []  vetorNotas, int nota) {	
		boolean result = false;
		int cont =0;
		int i=0;
		while(i<vetorNotas.length) {
		if(vetorNotas[i] == nota) {	
			result = true;
		}
		i++;
		cont++;
		}
		String questao = "pesquisa sequencial: quantas comparações = ";
		encontrouNota(result, questao);
		return cont;
	}
	
	static void encontrouNota(boolean resp, String questao) {

		if(resp) {
			System.out.print("nota encontrada, " + questao);
		}
		else {
			System.out.print("nota não encontrada, " + questao);
		}
		
	}
	
	static int buscarBinaria(int [] vetorNotas, int nota) {
		//questao4
		boolean result = false;
		int cont = 0;
		int inicio = 0;
		int meio;
		int fim = vetorNotas.length-1;
		
		while(inicio <= fim)
		{
			meio=(inicio + fim) / 2;

			if(vetorNotas[meio] < nota)
				inicio = meio + 1;
			else if (vetorNotas[meio] > nota)
				fim = meio - 1;
			else if(vetorNotas[meio] == nota) {
				
				result = true;
			}
			cont++;	
		}
		String questao = "pesquisa binaria: quantas comparações = ";
		encontrouNota(result, questao);
		return cont;
	}

}