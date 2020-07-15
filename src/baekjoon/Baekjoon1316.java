package baekjoon;
//그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
// 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
// aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
//단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws IOException{

        int cnt = 0;
        int input = Integer.parseInt(br.readLine());

        for(int i=0; i<input; i++){
            if(check()==true){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean check()throws IOException{
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = br.readLine();


        for(int i=0; i<str.length(); i++){
            int now = str.charAt(i); //i번째 문자 저장(현재 문자)

            // 앞선 문자와 i 번쨰 문자가 같지 않다면?
            if(prev != now){
                //해당 문자가 처음 나오는 경우(false 경우)
                if(check[now - 'a'] == false){
                    check[now - 'a'] = true; // true로 변환
                    prev = now; // 다음 턴을 위해 prev도 바꾸기
                }else{ // 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아닌 경우)
                    return false; // 함수종료
                }
            }else{ // 앞선문자와 i 번쨰 문자가 같다면? (연속된 문자) else 문 필요 x
                continue;

            }
        }
        return true;
    }
}