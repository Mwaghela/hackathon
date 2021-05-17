import java.io.*;
import java.util.*;
public class Test1 {
   public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		if(sc.hasNext()) {
			N = Integer.parseInt(sc.nextLine());
		}
		
		if(N <= 0 || N > 10000000) {
			System.out.println("N value exceeded");
			return;
		}
		
		String nextLine = "";
		if(sc.hasNext()) {
			nextLine = sc.nextLine();	
		}
		
		if((nextLine).split(" ").length != N) {
			System.out.println("quantityOfIngredients value exceeded");
			return;
		}
		
		long[] quantityOfIngredients = new long[N];
		int idx = 0;
		for(String str : (nextLine).split(" ")) {
			quantityOfIngredients[idx++] = Long.parseLong(str);
		}
		
		nextLine = "";
		if(sc.hasNext()) {
			nextLine = sc.nextLine();
		}

		if((nextLine).split(" ").length != N) {
			System.out.println("quantityOfIngredientsPresent value exceeded");
			return;
		}
		
		idx = 0;
		long[] quantityOfIngredientsPresent = new long[N];
		for(String str : (nextLine).split(" ")) {
			quantityOfIngredientsPresent[idx++] = Long.parseLong(str);
		}
		
		int totalNoOfPPG = 0;
		boolean ret = false;
		while(true) {
			for(idx = 0; idx < N; idx++) {
				if(quantityOfIngredients[idx] <= quantityOfIngredientsPresent[idx]) {
					quantityOfIngredientsPresent[idx] = quantityOfIngredientsPresent[idx] - quantityOfIngredients[idx];
				} else if(quantityOfIngredients[idx] > quantityOfIngredientsPresent[idx]) {
					ret = true;
					break;
				}
			}	
			if(ret) {
				break;
			}
			totalNoOfPPG++;
		}
		System.out.println(totalNoOfPPG);
   }
}