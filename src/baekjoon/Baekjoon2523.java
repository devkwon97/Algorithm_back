package baekjoon;
//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2523 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++){ // 1 ~ N
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=N-1; i>0; i--){ // N+1 ~ 2N-1
             for(int j=0; j<i; j++){
                 System.out.print("*");
             }
            System.out.println();
        }
    }
}
