/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode12 {
   public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);
      /*Taking no of rows and cols for Matrix 1*/
      String str1[] = (sc.nextLine()).split(" ");
      int n = Integer.parseInt(str1[0]);
      if(n < 1 || n > 100){
         return;
      }
      int m = Integer.parseInt(str1[1]);
      if(m < 1 || m > 100){
         return;
      }
      /*Reading Matrix 1*/
      int mat1[][] = new int[n][m];
      for(int idx = 0; idx < n; idx++){
         String str2[] = (sc.nextLine()).split(" ");
         for(int cols = 0; cols < m; cols++){
            if(Integer.parseInt(str2[cols]) < 1 || Integer.parseInt(str2[cols]) > 100){
               return;
            }
            mat1[idx][cols] = Integer.parseInt(str2[cols]);
         }
      }
      /*Taking no of rows and cols for Matrix 2*/
      String str3[] = (sc.nextLine()).split(" ");
      int p = Integer.parseInt(str3[0]);
      if(p < 1 || p > 100){
         return;
      }
      int q = Integer.parseInt(str3[1]);
      if(q < 1 || q > 100){
         return;
      }
      /*Reading Matrix 2*/
      int mat2[][] = new int[n][m];
      for(int idx = 0; idx < p; idx++){
         String str4[] = (sc.nextLine()).split(" ");
         for(int cols = 0; cols < q; cols++){
            if(Integer.parseInt(str4[cols]) < 1 || Integer.parseInt(str4[cols]) > 100){
               return;
            }
            mat2[idx][cols] = Integer.parseInt(str4[cols]);
         }
      }

      int mat3[][] = new int[n][m];
      /*adding matrix*/
      for(int i = 0; i < n; i++){
         for(int j = 0; j < m; j++){
            mat3[i][j] = mat1[i][j] + mat2[i][j];
         }
      }

      /*Print Result Matrix*/
      for(int i = 0; i < n; i++){
		  for(int j = 0; j < m; j++){
			  System.out.print(mat3[i][j]);
			  if(j != m-1){
				  System.out.print(" ");
			  }
		  }
          if(i != n-1){
            System.out.println();
          }
      }
   }
}
