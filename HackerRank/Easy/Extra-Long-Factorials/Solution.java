import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        BigInteger result = new BigInteger("1");
 
        if(n<=0 || n>100){
            System.out.println("Invalid !");
            System.exit(0);
        }
        if(n==1){
            System.out.println(1);
            System.exit(0);
        }
        for(int i=n; i>0; i--){
            result = result.multiply(BigInteger.valueOf(i));

        }
        System.out.println(result);
    }
}
