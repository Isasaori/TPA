public class ExercicioA {

	public static void main(String[] args) {
		int M[][] = new int [4][4];

		int i, j, x=2;

		for(i=0;i<4;i++) {

			for(j=0;j<4;j++) {

				M[i][j] = x;

				x*=2;
 
				System.out.println(M[i][j]);


				
			}
			
		}
		
		
		

	

		
	}
}
