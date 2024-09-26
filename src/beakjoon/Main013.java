package beakjoon;
import java.util.Scanner;

public class Main013{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        int A = Integer.valueOf(strArr[0]);
        int B = Integer.valueOf(strArr[1]);
        if(A>B){
            System.out.println(">");
        } else if(A<B){
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}