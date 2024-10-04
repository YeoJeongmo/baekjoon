package beakjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] input = br.readLine().split(" ");
            
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            
            if (A == 0 && B == 0) {
                break;
            }
            
            System.out.println(A + B);
        }
    }
}
