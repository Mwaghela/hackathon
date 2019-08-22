/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode10 {
   public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);
      String n = sc.nextLine();
      if(n.length() < 1 || n.length() > 100000){
         return;
      }
      int no = Integer.parseInt(n);
      String str = sc.nextLine();
	  if(str.length() < 1 || str.length() > (int)Math.pow(10,9)){
		 return;
	  }
      String strArr[] = str.split(" ");
      if(no != strArr.length){
         return;
      }
      int intArr[] = new int[strArr.length];
      for(int idx = 0; idx < strArr.length; idx++){
         intArr[idx] = Integer.parseInt(strArr[idx]);
      }
      int largestNo = intArr[0];
      int secondLargestNo = intArr[1];
      for(int idx = 2; idx < intArr.length; idx++){
         if(largestNo < intArr[idx]){
            secondLargestNo = largestNo;
            largestNo = intArr[idx];
         }else if(secondLargestNo < intArr[idx]){
            secondLargestNo = intArr[idx];
         }
      }
      System.out.print(secondLargestNo);
   }
}
