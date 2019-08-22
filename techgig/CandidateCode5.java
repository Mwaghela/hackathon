/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode5 {
   public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(n < 1 && n > 15){
         return;
      }
      int total = n;
      for(int idx = n-1; idx >= 1; idx--){
         total = total * idx;
      }
      System.out.print(total);
   }
}
