package baekjoon_string;
//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11720 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int num = Integer.parseInt(br.readLine());// 몇개 인지 입력
            String input = br.readLine();
            int result = 0;
            for(int i=0; i<num; i++){
                result += Integer.parseInt(input.substring(i,i+1));
            }
            System.out.println(result);
        }catch(Exception e){// 예외처리로 ex) 5입력후 1234 4개의 숫자만 입력하면 인덱스아웃오브바운스 에러
            e.printStackTrace();
        }
    }
}
