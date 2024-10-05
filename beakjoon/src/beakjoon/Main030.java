package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main030 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;

        while ((line = br.readLine()) != null) {
            String[] numbers = line.split(" ");
            int A = Integer.parseInt(numbers[0]);
            int B = Integer.parseInt(numbers[1]);

            if (A > 0 && B > 0 && A < 10 && B < 10) {
                bw.write((A + B) + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
