package beakjoon;

import java.io.*;

public class Main031 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] numbers = br.readLine().split(" ");
        
        int v = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(numbers[i]) == v) {
                count++;
            }
        }

        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}