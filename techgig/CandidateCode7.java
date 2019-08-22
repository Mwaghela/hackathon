/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode7 {
	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a < 1 || a > 100000){
			return;
		}
		a = a <= 3 ? 3 : a;
		int b = sc.nextInt();
		if(b < 1 || b > 100000){
			return;
		}
		int count = 0;   
		for(int idx = a;idx <= b; idx++){
			if(isPrime(idx)){
				count++;
			}
		}
		sc.close();
		System.out.print(count);
	}

	public static boolean isPrime(int num){
		int top = (int)Math.sqrt(num) + 1;
		for(int i = 2; i <= top; i++){
			if(num % i == 0){
				return false;
			}
		}
		return true; 
	}
}
