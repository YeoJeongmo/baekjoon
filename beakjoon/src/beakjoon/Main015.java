package beakjoon;

import java.util.Scanner;

public class Main015{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = 0;
        if(A>0 && B>0){
            result = 1;
        }else if(A>0 && B<0){
            result = 4;
        }else if(A<0 && B<0){
            result = 3;
        }else if(A<0 && B>0){
            result = 2;
        }
        System.out.println(result);
    }
}
