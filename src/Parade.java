import java.util.Scanner;


public class Parade {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many floats and boats are in the parade?");
		int n = input.nextInt();
		
		Parade parade1 = new Parade();
				
		System.out.println("You can have "+parade1.organizeParade(n)+" combinations of floats and boats.");

	}

	
	public int organizeParade(int n){
		
		
		if(n <= 1)
			return 2;
		else if(n == 2)
			return 3;
		else{
			
			int combos;
			return combos = organizeParade(n-1)+organizeParade(n-2);
		}
		
		
	}
}
