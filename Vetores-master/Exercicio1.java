import java.util.*;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int a[]=new int [10],b[] = new int [10];
		
		for(int i = 0;i<a.length;i++) {
			a[i]=ler.nextInt();
			if(a[i] %2 == 0) {
				b[i] = a[i];
				a[i] = 0;
			}
			
		}
		System.out.print("Numeros pares: [-");
		for(int i = 0;i<b.length;i++) {
			System.out.print(b[i]+"-");
			if(i == 4) {
				System.out.print("]");
			}
		}
		System.out.println();
		System.out.print("Numeros impares: [-");
		for(int i = 0;i<b.length;i++) {
			System.out.print(a[i]+"-");
			if(i == 4) {
				System.out.print("]");
			}
		}
		
	}
}
