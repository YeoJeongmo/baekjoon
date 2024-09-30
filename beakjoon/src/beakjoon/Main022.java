package beakjoon;

import java.util.Scanner;

public class Main022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int a = 0;
		int b = 0;
		int result = 0;
		for(int i=1;i<=N;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			result += a*b;
		}
		if(X==result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
