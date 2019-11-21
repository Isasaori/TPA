import java.util.Random;
public class ExercícioB {
	public static void main (String [] args) {
		Random x = new Random ();
		int M[] [] = new int [3] [3];
		int linha, coluna, n, ln=0, cl=0;
		
		for (linha = 0; linha < 3; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				M[linha] [coluna] = x.nextInt() % 21;
			}
		}
		
		n = M[0] [0];
		
		for (linha = 0; linha < 3; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				if(M[linha] [coluna] > n) {
					n = M[linha] [coluna];
					ln = linha;
					cl = coluna;
				}else {
					
				}
				
			}
		}
		System.out.print("\n: : VALORES DA MATRIZ: : \n\n");
		for(linha=0;linha<=2;linha++) {
			for(coluna=0;coluna<=2;coluna++) {
				System.out.print(" ["+M[linha] [coluna] +"] ");
				if(coluna==2) {
					System.out.print("\n");
				}
			}
		}
		
		System.out.println("O maior número dessa matriz é: " + n);
		System.out.println("Esse número está na linha " + (ln+1) + " e na coluna " + (cl+1));
	}
}
