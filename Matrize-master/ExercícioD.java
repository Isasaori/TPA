import java.util.Scanner;
import java.lang.Math;
public class ExercícioD {
	public static void main(String[]args) {
		Scanner ler = new Scanner (System.in);
		int r=0,v=0;
		int M[][] = new int [3][3];
		boolean teste = false;

		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				M[i][j] =(int) (Math.random()*75);
			}
		}
		while(v < 17) {
			System.out.println("Escreva um numero");
			r = ler.nextInt();
			for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(r == M[i][j]) {					
					v++;
					teste = true;
					}
				}
			}
			if(teste ==true ) {
				System.out.println("Acertou");
				teste = false;
			}else {
				System.out.println("Errou");
			}
			
		}
		System.out.println("Bingo");
	}
}	