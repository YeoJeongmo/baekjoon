package beakjoon;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

public class Main028{
    public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){
            // 공백은 N - i 개, 별은 i 개 출력
            for(int j = 1; j <= N - i; j++){
                bw.write(" ");
            }
            for(int j = 1; j <= i; j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}