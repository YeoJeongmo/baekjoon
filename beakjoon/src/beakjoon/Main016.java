package beakjoon;

import java.util.Scanner;

public class Main016{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        int A = Integer.valueOf(strArr[0]);
        int B = Integer.valueOf(strArr[1]);
        if(A==0 && B-45<0){
            A = 23;
            B = 15+B;
        } else if(B-45<0){
            A = A-1;
            B = 15+B;
        } else if(B-45>=0){
            B = B-45;
        }
        System.out.println(A+" "+B);
        
    }
}
