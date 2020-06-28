package baekjoon;
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. 종료값 없음
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10951 {
    static StringTokenizer st;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        //readLine() 을 통해 입력을 하여 str 에 저장된 데이터가 null 일 경우 while 반복문을 종료시켜버리고 아닐경우 반복문을 계속 수행하도록 한다.
        while((str=br.readLine()) != null ){
            st = new StringTokenizer(str," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println(A+B);
        }
        br.close();
    }
}
