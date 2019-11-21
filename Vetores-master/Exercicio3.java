import java.util.*;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int A[]=new int [11],cont=0;
		
		for(int i=0,j=1;i<A.length;i++,j++) {
			A[i] = ler.nextInt(); 
		}
		for(int i=0,j=1;i<A.length;i++,j++) {
			cont = 0;
		
			for(int div=1;div<=A.length;div++) {
				if(A[i] % div == 0)cont++; 
			}
			if(cont == 2) {
				System.out.println(A[i]+" eh primo");
			}else {
				System.out.println(A[i]+" nao eh primo");
			}
		}
	}
}
