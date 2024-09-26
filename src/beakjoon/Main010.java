package beakjoon;

import java.util.Scanner;

public class Main010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] Arr = str.split(" ");
		long answer = 0;
		for(int i=0;i<Arr.length;i++) {
			answer = answer + Long.valueOf(Arr[i]);
		}
		System.out.println(answer);
	}
}
