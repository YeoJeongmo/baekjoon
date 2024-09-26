package beakjoon;

import java.util.Scanner;
public class Main014 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int reward = sc.nextInt();
		if(reward>=90) {
			System.out.println("A");
		} else if(reward>=80) {
			System.out.println("B");
		} else if(reward>=70) {
			System.out.println("C");
		} else if(reward>=60) {
			System.out.println("D");
		} else if(reward<60) {
			System.out.println("F");
		}
	}
}
