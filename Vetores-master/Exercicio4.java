import java.util.Scanner;
public class Exercicio4 {
	public static void main(String args[]) {
		Scanner ler=new Scanner(System.in);
		
		int v[]=new int [10];
		for(int i=0;i<10;i++) {
			v[i]=ler.nextInt();
		}
		for(int i=0;i<10;i++) {
			if(v[i]%2==0) {
				for(i = 0;i<v[i];i+=2) {
					System.out.print("Os numeros pares são: "+i);
				}
			}
		}
	
	
	
	
	}
}

