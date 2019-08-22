/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode13 {
   public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);
      /*Reading Co ordinates */
      String str[] = (sc.nextLine()).split(" ");
      int n = Integer.parseInt(str[0]);
      if(n < 1 || n > 100){
         return;
      }
      int m = Integer.parseInt(str[1]);
      if(m < 1 || m > 100){
         return;
      }

      int mat1[][] = new int[n][m];
      /*Reading Matrix*/
      for(int idx = 0; idx < n; idx++){
         String str2[] = (sc.nextLine()).split(" ");
         for(int cols = 0; cols < m; cols++){
			 if(Integer.parseInt(str2[cols]) < 1 || Integer.parseInt(str2[cols]) > 100){
				return;
			 }
            mat1[idx][cols] = Integer.parseInt(str2[cols]);
         }
      }

      /*Transpose Matrix*/
      int mat2[][] = new int[m][n];
      for(int rows = 0; rows < n; rows++){
         for(int cols = 0; cols < m; cols++){
            mat2[cols][rows] = mat1[rows][cols];
         }
      }

      /*Printing Transpose Matrix*/
      for(int rows = 0; rows < m; rows++){
         for(int cols = 0; cols < n; cols++){
            System.out.print(mat2[rows][cols]);
			if(cols != n-1){
				System.out.print(" ");
			}
         }
		 if(rows != m-1){
			System.out.println();
		 }
      }
	  sc.close();
   }
}
