import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static String getSolution(String[] str, String[] pattern){
        int cur=0;
        int[] resultIndex = new int[pattern.length];
        int solved=0;
        first:
        for(int i=0; i<pattern.length; i++){
            second:
            for(int j=cur; j< str.length; ){
                if(str[j].contains(pattern[i])){
                    if(i==0){
                       solved = 0;
                       for(int k=0; k<pattern[i].length();k++){
                           resultIndex[k] = str[j].indexOf(pattern[i].charAt(k));
                           cur++;
                           j=cur;
                           solved++;
                           if(solved == pattern.length){
                                    return "YES";
                           }
                           
                           continue first;
                       } 
                    }else{
                        for(int k=0; k<pattern[i].length(); k++){
                          if(resultIndex[k] != str[j].indexOf(pattern[i])){
                                i=-1;
                                cur++;
                                j=cur;
                                solved=0;
                                continue first;
                            }else{
                                cur++;
                                j=cur;
                                i++;
                                solved++;
                                if(solved == pattern.length){
                                    return "YES";
                                }
                                continue second;
                            }
                        }
                    }
                } else if(i==0){
                    cur++;
                    j=cur;
                }else{
                    i=-1;
                    cur++;
                    j=cur;
                    continue first;
                        
                }        
                
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int numberOfTestCases = scan.nextInt();
        if(numberOfTestCases < 1 || numberOfTestCases > 5){
            System.out.println("Invalid Number of Test cases !");
            System.exit(0);
        }

        String [] result = new String[numberOfTestCases];
        for(int i=0; i< numberOfTestCases; i++){
            int rows = scan.nextInt();
            int col = scan.nextInt();
            if(rows < 1 || rows > 1000 || col < 1 || col > 1000){
                System.out.println("Invalid Number of Test cases !");
                System.exit(0);
            }
            String [] str = new String[rows];
            for(int j=0; j<rows; j++){
                str[j] = scan.next();
            }
            rows = scan.nextInt();
            col = scan.nextInt();
            String [] pattern = new String[rows];
            for(int j=0; j<rows; j++){
                pattern[j] = scan.next();
            }
            result[i] = getSolution(str, pattern);    
            
        }
        for(int i=0; i<numberOfTestCases; i++){
            System.out.println(result[i]);
        }
    }
}
