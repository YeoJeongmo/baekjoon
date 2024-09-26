package beakjoon;

import java.util.Scanner;

public class Main009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String BStr=Integer.toString(B);
        int count = 1;
        int answer = 0;
        int value = 0;
        for(int i=BStr.length()-1; i>=0; i--) {
        	value = A*Character.getNumericValue(BStr.charAt(i));
        	answer = answer + value*count;
        	System.out.println(value);
        	count = count *10;
        }
        System.out.println(answer);
    }
}
