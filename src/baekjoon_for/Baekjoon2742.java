package baekjoon_for;
//자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.(반대출력)
import java.io.*;

public class Baekjoon2742 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());

        for(int i=input; i>0; i--){
            bw.write(i+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
