package baekjoon;
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10952 {
    static StringTokenizer st;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(A==0 && B==0){
                break;
            }
            bw.write(Integer.toString(A+B));
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
