/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode14 {
   public static void main(String args[] ) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      /*Reading number of lines*/
      int n = Integer.parseInt(br.readLine());
	  if(n < 1 || n > 10000){
         return;
      }
      String strArr[] = new String[n];
      /*Reading input one by one*/
      for(int idx = 0; idx < n; idx++){
         String str = br.readLine();
         if(str.length() < 1 || str.length() > 1000){
            return;
         }
         strArr[idx] = str;
      }

      /*Sorting*/
      //Arrays.sort(strArr);
	  Arrays.sort(strArr, Collections.reverseOrder());
	  

      /*Priting result*/
      for(int idx = 0; idx < n; idx++){
         System.out.print(strArr[idx]);
		 if(idx != n-1){
			System.out.println();
		 }
      }
      br.close();
   }
}
