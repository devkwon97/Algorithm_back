package baekjoon;
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10950 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<input; i++){
            st = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
            sb.append("\n");
        }
        System.out.println(sb);
        // BufferedReader은 문자열로 받아들이는데 한 줄에 정수 2개니깐 공백을 기준으로 문자열 분리.
        // -> StringTokenizer 사용(split()메서드 보다 성능 좋음)
        //배열 따로 생성해서 저장하기 보다 StringBuilder에 계산한 식을 넣어주고 한번에 출력하기
    }
}
