import java.io.*;
import java.util.*;
public class Test2 {
   public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 0, NoOfMembers = 0, idx1 = 0, idx2 = 0, next = 0, counter = 0, matchCounter = 0;
		long TotalPlayers = 0;
		boolean LoopBreaker = false;
		String nextLine = "";
		
		if(sc.hasNext()) {
			T = Integer.parseInt(sc.nextLine());
			if(T <= 0 || T > 100000) {
				return;
			}
		}
		
		if(sc.hasNext()) {
			NoOfMembers = Integer.parseInt(sc.nextLine());
			if(NoOfMembers <= 0 || NoOfMembers > 100000) {
				return;
			}
		}
		
		TotalPlayers =  (T * N);

		long[] G_Revolution = new long[NoOfMembers];
		counter = 0;
		while(true) {
			if(sc.hasNext()){
				nextLine = sc.nextLine();
				
			}
			if(LoopBreaker) {
				break;
			}
		}
		/* Working logic */
		/*
		long[] G_Revolution = new long[NoOfMembers];
		counter = 0;
		while(counter < (NoOfMembers-1)){
			if(sc.hasNext()) {
				nextLine = sc.nextLine();
				counter = counter + (nextLine).split(" ").length;
				for(String str : (nextLine).split(" ")) {
					G_Revolution[idx1++] = Long.parseLong(str);
				}
			}
		}
		
		Arrays.sort(G_Revolution);
		
		long[][] Opponents = new long[T][NoOfMembers];
		boolean flag1 = false;
		idx1 = 0;
		idx2 = 0;
		nextLine = "";
		while(true) {
			if(sc.hasNext()) {
				nextLine = sc.nextLine();
				nextLine = nextLine.replaceAll("\\r|\\n", "");
				if(!nextLine.equalsIgnoreCase("")) {
					for(String str : (nextLine).split(" ")) {
						if(!str.equalsIgnoreCase("")) {
							System.out.println("Inserting value for::"+idx2);
							Opponents[idx1][idx2++] = Long.parseLong(str);
						}
						if(idx2 == NoOfMembers) {
							if(idx1 == (T-1)) {
								break;
							}
							idx2 = 0;
							Arrays.sort(Opponents[idx1++]);
						}
					}
				}
			}
			
			if(idx1 == (T-1)) {
				Arrays.sort(Opponents[idx1]);
				break;
			}
		}
		*/
		
		
		for(idx1 = 0; idx1 < T; idx1++) {
			matchCounter = 0;
			idx2 = 0;
			for(next = 0; next < NoOfMembers;) {
				if(G_Revolution[idx2] > Opponents[idx1][next]) {
					matchCounter++;
					idx2++;
					next++;
				} else if(G_Revolution[idx2] == Opponents[idx1][next]){
					idx2++;
					next++;
				} else {
					idx2++;
				}
				if(next == (NoOfMembers) || idx2 == (NoOfMembers)) {
					break;
				}
			}
			System.out.println(matchCounter);
		}
   }
}