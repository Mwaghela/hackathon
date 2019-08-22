/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCode2 {
    public static void main(String args[] ) throws Exception {
		
		/* Solution 1 */
		
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()){
			System.out.print("This input is of type Integer.");
		}else if(sc.hasNextFloat()){
			System.out.print("This input is of type Float.");
		}else if (sc.hasNextLine()){
			System.out.print("This input is of type string.");
		}else {
			System.out.print("This is something else.");
		}
		sc.close();
		
		/* Solution 2
		String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
		  if(str.length() > 1 && str.length() < 10000){
			 Scanner scanner = new Scanner(str.trim());
			 if(scanner.hasNextInt()) 
				System.out.print("This input is of type Integer.");
			 else if(scanner.hasNextFloat())
				System.out.print("This input is of type Float.");
			 else if(scanner.hasNextLine())
				System.out.print("This input is of type string.");
			 else
				System.out.print("This is something else.");
			 scanner.close();
		  }
		
		*/
	}
}