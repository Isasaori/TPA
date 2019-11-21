import java.util.Scanner;
public class Exercicio12 {
	public static void main(String agr[]) {
		Scanner ler=new Scanner (System.in);
		
		int a[]=new int [5], b[]=new int [5],l=0;
		for(int i=0;i<5;i++) {
			a[i]=ler.nextInt();
		}
		for(int i=0;i<5;i++) {
			b[i]=ler.nextInt();
		}
		for(int i=0,x=4,y=0;i<10 && y<5 && x>-1;i++,y++,x--,l++) {
			if(a[y]==b[x]) {
				l++;
			}
		}
		if(l==10) {
			System.out.println("A vetor é palindromo");
		}else {
			System.out.println("O vetor não é palindromo");
		}
	
	}
}
	
