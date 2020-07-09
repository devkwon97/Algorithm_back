package baekjoon;
//알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
// 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
//첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
import java.io.*;

public class Baekjoon10809 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        // 아스키값 a=97 ~ z=122  총 26개
        // 인덱스오브는 문자값 아스키로 돌려서 input에 들어오는 문자값 하나하나씩 검증하고 스펠링이없음 -1 있으면 몇번째자리에있는지 대입
        for(int i='a'; i<='z'; i++){
            bw.write(input.indexOf(i) + " ");
        }
        bw.newLine();
        br.close();
        bw.flush();
        bw.close();
    }
}
