import java.util.Scanner;
public class Exercicio13 {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		
		int a[]=new int [10];
		int b[]=new int [10];
		for(int i = 0;i<10;i++) {
			a[i]=ler.nextInt();
			if ( a[i]%2 == 0) {
				b[i]=1;
			}if (a[i]%2 != 0 ) {
				b[i]=0;
			}
		}
		for(int i = 0 ; i<10; i++) {
			System.out.print(b[i]+" ");
		}
		
	}
}
