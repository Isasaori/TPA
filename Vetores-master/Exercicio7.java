import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int a[] = new int [15],b[] = new int [15];
		for(int i = 0 ; i < a.length;i++) {
			a[i] = ler.nextInt();
			int x = a[i];
			b[i] = 1;
			for(;x>=1;x--) {
				b[i] = b[i] * x;
			}
			System.out.println("Fatorial de "+a[i]+" = "+b[i]);
		}
	}
}
