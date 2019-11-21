import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int v[] = new int [10];
		for(int i = 0;i < v.length;i++) {
			v[i] = ler.nextInt();
			System.out.print("Numeros divisiveis de "+v[i]+": [-");
			for(int div = 1;div <= v.length;div++) {
				if(v[i] % div == 0) {
					System.out.print(div+"-");
					if(div == v[i])System.out.print("]");
				}
			}
		}
	}
}
