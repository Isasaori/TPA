import java.util.*;
public class Exercicio2 {
	public static void main(String args[]) {
		
		int vetor[]=new int [5];
		int tabuada;
		Scanner in = new Scanner (System.in);
		for(int i = 0; i < 5; i++) {
			vetor[i]=in.nextInt();
			for(int tab=0;tab<=10;tab++) {
				tabuada=vetor[i]*tab;
				System.out.println(tab+" X "+ vetor[i]+" = "+tabuada);
			}
		}
		
	}
}
