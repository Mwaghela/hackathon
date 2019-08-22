/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCode3 {
    public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double principal = Double.valueOf(br.readLine());
		if(1>principal && principal> 1000){
			return;
		}
		int interest = Integer.parseInt(br.readLine());
		if(1>interest && interest> 1000){
			return;
		}
		int year = Integer.parseInt(br.readLine());
		if(1>year && year> 1000){
			return;
		}
		System.out.print(Math.round((principal * interest * year) / 100));
		br.close();
	}
}