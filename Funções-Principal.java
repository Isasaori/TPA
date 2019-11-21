import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int n1 , n2 , result, op;
	
	System.out.print("Escolha uma opção: 1-Fatorial; 2-Tabuada; 3-Potência; 4-Aposentadoria" );
	op = ler.nextInt();
	
	switch(op){
	
		case 1:
			{
				System.out.print("Digite um número para calcular seu fatorial : ");
				
				n1=ler.nextInt();
				result = Fatorial(n1);
				System.out.println("O fatorial de "+ n1 + " é igual a:" +result);
				break;
			}
		
		
		
		case 2:
			{
				System.out.print("Digite um número para calcular sua tabuada : ");
				
				n1 = ler.nextInt();
				result = Tabuada(n1);
				break;
			}
			
		case 3:
			{
				System.out.println("Digite uma base e um expoente para calcular sua potencia : ");
				System.out.print("Base: ");
				n1=ler.nextInt();
				System.out.print("Expoente: ");
				n2=ler.nextInt();
				
				result = Potência(n1, n2);
				System.out.print(n1+" elevado a "+n2+" é igual a: "+result);
				break;
			}
		
		case 4:
			{
				System.out.println("Digite seu sexo e sua idade para calcular quantos anos faltam para se aposentar : ");
				System.out.print("Feminino-1; Masculino-2: ");
				n1 = ler.nextInt();
				System.out.print("Idade: ");
				n2 = ler.nextInt();
				
				result=Aposentadoria(n1,n2);
				System.out.print("Você vai se aposentar em " + result + " anos.");
				break;
			}
		
		default:
			{
				System.out.print("Esta não é uma opção válida !!!");
				break;
			}
	}
	
	
	}

	public static int Fatorial (int n1) {
		int i=1, n2;
		n2=n1;
		while (i < n1) {
			n2 = n2 * i;
			i++;
		
	}
		return n2;
		
	}
	
	public static int Tabuada (int n1) {	
		int i=0, r;
		System.out.println("Tabuada do "+n1);
		for(i=1; i<11; i++) {
			r = n1 * i;
			System.out.println(n1+"X"+i+"="+r);
						
		}
		return n1;
	}

	
	public static int Potência(int n1, int n2){
		int x=0, i=0;
		x=n1;
		for(i=1; i<n2; i++) {
			x = x * n1;
		}
		return x;
		
	}
	
	public static int Aposentadoria(int n1,int n2) {
		int r=0;
		switch(n1){
		
			case 1:{
					r = 55 - n2;
				}
			
			case 2:{
					r = 60 - n2;
				}
				
			}
		return r;		
	}



}