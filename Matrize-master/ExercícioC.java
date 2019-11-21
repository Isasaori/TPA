import java.util.Scanner;
import java.lang.Math;
public class Ex1{
	public static void main(String[]args){
		Scanner ler = new Scanner (System.in);
		int M [][] = new int[3][4];
		int x=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				
				M [i][j] = (int) (Math.random()*10);
				System.out.print(M[i][j]+"-");
				x = x + M[i][j];
				if(j == (M.length-1)) {
				M[i][3] = x;
				System.out.println(M[i][3]);
				x = 0;
				}
			}
		}

   }
}
