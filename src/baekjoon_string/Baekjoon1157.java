package baekjoon_string;
//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1157 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine().trim().toUpperCase(); // 65~90까지 대문자 입력값
        int[] cnt = new int[26]; // 알파벳 카운트 저장한 int 배열
        int max = 0; //가장 많이 나온 알파벳수 저장할 변수
        char answer = '?'; //정답을 저장하는 변수

        for(int i=0; i<input.length(); i++){ // 문자열 길이 만큼 반복
            cnt[input.charAt(i)-65]++; // 현재 알파벳을 알파벳카운트배열 index에 +1하기 ex)a면 arr[65-65]++; -> arr[0]방안에 현재 1
            if(max < cnt[input.charAt(i)-65]){ // 현재 알파벳 수가 max보다 크면
                answer = input.charAt(i); // 정답에 현재 알파벳 저장
                max = cnt[input.charAt(i)-65]; // max 변수에 현재 알파벳 수 저장
            }else if(max == cnt[input.charAt(i)-65]){
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}