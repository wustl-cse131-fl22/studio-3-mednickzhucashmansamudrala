package studio3;
import java.util.*;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = in.nextInt();
				
		boolean[] primes;
		primes = new boolean[n+1];
		
		for(int b = 0; b<primes.length; b++) { //Sets everything to true
			primes[b] = true;
		}
		
		/*for(boolean b : primes) {
			System.out.println(b);
		}*/ //Prints n trues
				
		for(int i = 2; i<Math.sqrt(n); i++) { 
			if(primes[i] == true) {
				for(int j=(int)Math.pow(i, 2); j<=n; j=j+i) {
					primes[j] = false;
					//System.out.println("Number at " + i + " is prime ");
				}
			}
		}
		
		for(int k = 0; k<primes.length; k++) {
			if(primes[k] == true) {
				System.out.println(k);
			}			
		}
		
	}

}
