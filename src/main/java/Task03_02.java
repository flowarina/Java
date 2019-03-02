package week02;

import java.util.Scanner;

public class Task03_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Task03_02.getSum(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }
    public static int getSum(int a, int b, int c, int d, int e) {
        return a+b+c+d+e;
    }
}
