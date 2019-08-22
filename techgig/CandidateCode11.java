/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode11 {
   public static void main(String args[] ) throws Exception {
      String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
      if(str.length() < 1 && str.length() > 100000 ){
         return;
      }
      int lowerChar = 0;
      int upperChar = 0;
      for(int idx = 0;idx < str.length(); idx++){
         if(Character.isUpperCase(str.charAt(idx))){
            upperChar++;
         }else if(Character.isLowerCase(str.charAt(idx))){
            lowerChar++;
         }
      }
      System.out.println(upperChar);
	  System.out.print(lowerChar);
   }
}
