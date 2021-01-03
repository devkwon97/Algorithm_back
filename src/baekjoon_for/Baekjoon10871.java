package baekjoon_for;
//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
//첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
//
//둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10871 {
    static StringTokenizer st;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 첫줄에 입력받은 총 숫자와 갯수 N, X 입력
        st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        // 다음줄에 공백을 기준으로 N개에 대한 숫자들 입력
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            int x = Integer.parseInt(st.nextToken());
            //x가 X보다 작으면 빌더에 저장
            if (x < X) {
                sb.append(x).append(" ");
            }
        }
        System.out.print(sb);
        br.close();
    }
}
