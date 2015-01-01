import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseCount = sc.nextInt();
        for(int i = 0; i < caseCount; i++) {
            printHeight(sc.nextInt());
        }
    }
    
    public static void printHeight(int numCycles) {
        int height;
        if(numCycles % 2 != 0){
            height = calcHeight(numCycles);
            
        }else{
            height = calcHeight(numCycles - 1) + 1;
        }
        System.out.println(height);
    }
    
    public static int calcHeight(int n) {
        if(n < 1)
            return 0;
        else if(n == 1)
            return 2;
        else
            return (int) Math.pow(2, (n+1) / 2) + calcHeight(n - 2);
    }
}
