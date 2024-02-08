package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter an integer.");
		int n = in.nextInt();


		
		boolean[] isPrime = new boolean[n+1];
		for (int i = 2; i < isPrime.length; i++) {
			isPrime[i] = true;
		}
		for (int j = 2; j <= Math.sqrt(n); j++) {
			if (isPrime[j] == true) {
				for (int k = j * j; k <= n; k = k + j) {
					isPrime[k] = false;
				}
			}
		}
		for(int q = 2; q <= n; q++) {
			if(isPrime[q]==true) {
				System.out.println(q + " is prime!");
				
			}
			}
		}

	}

