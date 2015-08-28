import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int [] date1 = new int[3];
        int [] date2 = new int[3];
        for(int i=0; i<3; i++){
            date2[i] = scan.nextInt();
        }
        for(int i=0; i<3; i++){
            date1[i] = scan.nextInt();
        }
        if(date2[2]< date1[2]){
            System.out.println(0);
            System.exit(0);
        }
        if(date2[2] == date1[2] && date2[1] < date1[1]){
            System.out.println(0);
            System.exit(0);
        }
        if(date2[2] == date1[2] && date2[1] == date1[1] && date2[0] < date1[0]){
            System.out.println(0);
            System.exit(0);
        }
        if(date1[0] > 31 || date1[1] > 12 || date1[2] > 3000 || date2[0] > 31 || date2[1] > 12 || date2[2] > 3000 ){
            System.out.println(0);
            System.exit(0); 
        }
        if(date1[0] < 1 || date1[1] < 1 || date1[2] < 1 || date2[0] < 1 || date2[1] < 1 || date2[2] < 1 ){
            System.out.println(0);
            System.exit(0); 
        }
        if(date2[2] < date1[2]){
            System.out.println(0);
            System.exit(0);
        }
        
        
        if(date2[2] == date1[2]){
            if(date2[1] == date1[1]){
                if(date2[0] == date1[0]){
                    System.out.println(0);
                    System.exit(0);
                }else{
                    System.out.println(15*Math.abs(date2[0] - date1[0]));
                    System.exit(0);
                }
            }else{
                    System.out.println(500*Math.abs(date2[1] - date1[1]));
                    System.exit(0);
                }
        }else{
                    System.out.println(10000);
                    System.exit(0);
                }

    }
}
