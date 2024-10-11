package beakjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main035 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] baskets = new int[N + 1];

        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int x = i; x <= j; x++) {
                baskets[x] = k;
            }
        }

        for (int x = 1; x <= N; x++) {
            bw.write(baskets[x] + " ");
        }
        bw.write("\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
