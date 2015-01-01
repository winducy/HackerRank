import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class isFibo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCount = sc.nextInt();
        for(int i = 0; i < numCount; i++){
            printAnswers(sc.nextDouble());
        }
    }
    
    public static void printAnswers(double test) {
        System.out.println(isFibo(test)? "IsFibo" : "IsNotFibo");
    }
    
    public static boolean isFibo(double test) {
        return isPerfectSquare(5*test*test + 4) || isPerfectSquare(5*test*test - 4);
    }
    
    public static boolean isPerfectSquare(double test) {
        return Math.sqrt(test) % 1 == 0;
    }
}