/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode4 {
   public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();
      if(age >= 1 && age <= 100){
         if(age < 10){
            System.out.print("I am happy as having no responsibilities.");
         }else if(age >= 10 && age < 18){
            System.out.print("I am still happy but starts feeling pressure of life.");
         }else{
            System.out.print("I am very much happy as i handled the pressure very well.");
         }
      }
   }
}
