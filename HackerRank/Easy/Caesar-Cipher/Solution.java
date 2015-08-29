import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static char getNextChar(char c, int k){
        char temp = Character.toLowerCase(c);
        int val = (int) c;
        k=k%26;
        if((val >= (int)'a') && (val <= (int)'z')){
            int chopLeft = (int) 'a';
            int chopRight = (int) 'z';
            val = val + k;
            if(val > chopRight){
                val = (val - chopRight) + chopLeft-1;
            }
            //System.out.println(val +" : " + (char) val);
            return ((char)val);
        }else if((val >= (int)'A') && (val <= (int)'Z')){
            int chopLeft = (int) 'A';
            int chopRight = (int) 'Z';
            val = val + k;
            if(val > chopRight){
                val = (val - chopRight) + chopLeft-1;
            }
            //System.out.println(val +" : " + (char) val);
            return ((char)val);
        }else{
            return c;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // length of string
        if(N<1 || N>100){
            System.out.println("Invalid Input !!!");
            System.exit(0);
        }
        String temp = scan.next();
        char [] S = new char[N];
        if(S.length == 0){
            System.out.println("Empty String !");
        }
        S = temp.toCharArray();
        int K = scan.nextInt(); // how many times rotated
        if(K<0 && K>100){
            System.out.println("Invalid Input !!!");
            System.exit(0);
        }
        
        for(int i=0; i<S.length; i++){
            S[i] = getNextChar(S[i],K);
        }
        for(int i=0; i<S.length; i++){
            System.out.print(S[i]);
        }
        
    }
}
