package baekjoon_for;
// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon8393 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i=1; i<=input; i++){
            result+=i;
        }
        System.out.print(result);
    }
}
