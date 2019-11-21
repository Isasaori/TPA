import java.util.Scanner;
public class Exercicio8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int a[] = new int [10],b[] = new int [10],sum=0;
		for(int i=0;i<a.length;i++) {
			a[i] = ler.nextInt();
		}
		for(int i=9;i>=0;i--) {
			sum+=a[i];
			b[i] = sum;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println("A["+i+"] = "+a[i]+" --- B["+i+"] = "+b[i]);
		}
	}
}
