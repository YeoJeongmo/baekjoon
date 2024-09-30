package beakjoon;

import java.util.Scanner;

public class Main017 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cooking = sc.nextInt();
        String[] strArr = str.split(" ");
        int hour = Integer.valueOf(strArr[0]);
        int minute = Integer.valueOf(strArr[1]);
        int addHour = 0;
        if(minute+cooking>=60){
        	addHour = (minute+cooking)/60;
        	if(hour+addHour>=24) {
        		hour = hour+addHour-24;
        	} else {
        		hour = hour+addHour;
        	}
        	minute = (minute+cooking)%60;
        } else if(minute+cooking<60) {
        	minute = minute + cooking;
        }
        System.out.println(hour+" "+minute);
	}
}
