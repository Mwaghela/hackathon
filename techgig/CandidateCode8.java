/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode8 {
   public static void main(String args[] ) throws Exception {
      String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
      if(str.length() < 1 && str.length() > 18){
         return;
      }
      int n = Integer.parseInt(str);
      int count = n;
      int total = 0;
      do{
         int k = count%10;
         total = total + (int)Math.pow(k,3);
         count = count/10;
      }while(count > 0);
      if(total == n){
         System.out.print("True");
      }else{
         System.out.print("False");
      }
   }
}
