
import java.io.*;
import java.util.*;
public class CandidateCode6 {
   public static void main(String args[] ) throws Exception {
      String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
      if(str.length() > 18 && str.length() < 1){
         return;
      }
      int n = Integer.parseInt(str);
      int count = 0;
      while(n > 0){
         n = n/10;
         count++;
      }
      System.out.print(count);
   }
}