import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.*;

public class LR1 {
    private static int FibonacciSum(int n) {

        int currVal = 1;
        int prevVal = 0;
        int sum = 1;
        if (n == 0)
            return 0;
        if(n == 1)
            return 1;
        for (int i = 2; i < n; i++) {
            int temp = currVal;
            currVal = prevVal + currVal;
            prevVal = temp;
            sum += currVal;}
        return sum;
    }
    public static void main(String[] args) {
        int num = 0;
        try {
            num = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Failed trying to parse a non-numeric argument, " + args[0]);
        }
        System.out.println("Сума перших " + num + " чисел Фібоначчі - ");
        System.out.print(LR1.FibonacciSum(num));
    }
}
