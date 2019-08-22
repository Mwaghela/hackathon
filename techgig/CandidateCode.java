import java.io.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {
      String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
      if(str.length() > 1 && str.length() < 10000){
         System.out.print("Hello Techgig\n"+str);
      }
   }
}