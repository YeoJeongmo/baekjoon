package beakjoon;

import java.util.Scanner;

public class Main023 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = N/4;
		String result = "";
		for (int i=1;i<=count;i++) {
			result += "long ";
		}
		System.out.println(result + "int");
		
	}
}
