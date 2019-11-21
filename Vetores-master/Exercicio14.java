import java.util.Scanner;
public class Exercicio14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[]=new int [5], b[]=new int [5], c[]=new int [5]; 
		for(int i=0;i<a.length;i++) {
			a[i] = ler.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			b[i] = ler.nextInt();
		}
		for(int i=0;i<c.length;i++) {
			if(a[i] > b[i])c[i] = 1;
			else if (a[i] == b[i])c[i] = 0;
			else if (a[i] < b[i])c[i] = -1;
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" - ");
		}
		
	}
}
