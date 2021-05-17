import java.io.*;
import java.util.*;
public class RoughWork {
   public static void main(String args[] ) throws Exception {
	 String str = " 1 2 3 4 \r\n 5 6 7 8 ";
	 System.out.println("Input:"+str);
	 str = str.replaceAll(" \r\n", "");
	 System.out.println("Output:"+str);
   }
}