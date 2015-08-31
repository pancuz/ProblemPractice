import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static String getSolution(char[] str, char[] rev){
        if(str == null || rev == null){
            return null;
        }
        for(int i=1; i<str.length; i++){
            if(Math.abs((int)str[i] - (int)str[i-1]) != Math.abs((int)rev[i] - (int)rev[i-1])){
                return "Not Funny";
            }
        }
        return "Funny";
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int numberOfTestCases = scan.nextInt();
        if(numberOfTestCases < 1 || numberOfTestCases > 10){
            System.out.println("Invalid number of test cases !");
            System.exit(0);
        }
        String [] result = new String[numberOfTestCases];
        for(int i=0; i<numberOfTestCases; i++){
            String str = scan.next();
            if(str.length() < 2 || str.length() > 10000){
                System.out.println("Invalid length of the String");
                System.exit(0);
            }
            String rev = new StringBuilder(str).reverse().toString();
            result[i] = getSolution(str.toCharArray(),rev.toCharArray());
        }
        for(int i=0; i<numberOfTestCases; i++){
            System.out.println(result[i]);   
        }
    }
}
