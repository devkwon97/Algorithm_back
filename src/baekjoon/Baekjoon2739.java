package baekjoon;
//N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
import java.io.*;

public class Baekjoon2739 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        for(int i=1; i<=9; i++){
            bw.write(num+" * "+i+" = "+num*i+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}