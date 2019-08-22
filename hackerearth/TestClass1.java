/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.*/
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass1 {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        if(T < 1 || T > 7){
            return;
        }
		int tArr[] = new int[T];
		int i, j;
        for(int idx = 0; idx < T; idx++){
			String str = br.readLine();
			if((str.length() < 2 || str.length() > 100000)){// || (str.length() % 2 != 0)){
				return;
			}
			i = 0;
			j = str.length()-1;
			int count1 = 0;
			int count2 = 0;
			do{
				if(str.charAt(i) == '('){
					i++;
					count1++;
					/*System.out.println("str.charAt(i):"+str.charAt(i)+" count1:"+count1+" i:"+i);*/					
				}else{
					i++;
				}
				if(str.charAt(j) == ')'){
					j--;
					count2++;
					/*System.out.println("str.charAt(i):"+str.charAt(i)+" count2:"+count2+" j:"+j);*/
				}else{
					j--;
				}
				/*System.out.println("i="+i+" j="+j+" i <= j:"+(i<=j));*/
			}while(i <= j);
			if(count1 < count2){
				tArr[idx] = count1 * 2;
			}else{
				tArr[idx] = count2 * 2;
			}
		}
		br.close();
		/*Printing Result*/
		for(int idx = 0; idx < T; idx++){
			System.out.print(tArr[idx]);
			if(idx != (T - 1)){
				System.out.println();
			}
		}
    }
}
