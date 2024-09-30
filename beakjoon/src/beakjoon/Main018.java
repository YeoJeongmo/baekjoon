package beakjoon;

import java.util.Scanner;

public class Main018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		int A = Integer.valueOf(strArr[0]);
		int B = Integer.valueOf(strArr[1]);
		int C = Integer.valueOf(strArr[2]);
		int result = 0;
		if(A==B&&B==C) {
			result = 10000+A*1000;
		} else if(A==B&&A!=C || A==C&&A!=B) {
			result = 1000+A*100;
		} else if(B==C&&B!=A) {
			result = 1000+B*100;
		} else if(A>B&&A>C) {
			result = A*100;
		} else if(B>A&&B>C) {
			result = B*100;
		} else if(C>B&&C>A) {
			result = C*100;
		}
		System.out.println(result);
	}
}
