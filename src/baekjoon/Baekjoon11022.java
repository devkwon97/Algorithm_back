package baekjoon;
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon11022 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i=1; i<=input; i++){
            st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write("Case #"+i+": "+A+" + "+ B +" = "+(A+B)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
