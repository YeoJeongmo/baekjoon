package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main025{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());
        for(int i=1;i<=T;i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());;
            bw.write("Case #"+ i +": " + A + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
