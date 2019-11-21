import java.util.Scanner;
public class Exercicio9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[]=new int [10], b[]=new int [10], c[]=new int [10]; 
		for(int i=0;i<a.length;i++) {
			a[i] = ler.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			b[i] = ler.nextInt();
		}
		for(int i=0,j=0;i<c.length;i++) {
			if(a[j] == b[i]) {
				c[i] = a[j];
			}
			if(i==9);j++;
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" - ");
		}
	}
}
