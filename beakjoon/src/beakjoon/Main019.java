package beakjoon;

import java.util.Scanner;

public class Main019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		while(count<10) {
			System.out.println(N + " * " + count + " = " + N*count);
			count++;
		}
	}
}
