package baekjoon;
//0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
//
//26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
//
//위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
//
//N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1110 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        int cnt = 0; //새로운 수 입력
        int copy = input; //변수 복사

        //copy = (N/10 + N%10)%10	// copy의 일의 자릿수
        //처음 입력값을 복사한 변수 copy
        //반복문이 몇 번 반복되었는지 세어주는 변수 count
        //처음 입력값과 새로운 변수가 같을 경우 반복문을 종료하기 위한 조건문

        while (true){
            input = ( (input%10)*10) + ( ((input/10) + (input%10)) %10 );
            cnt++;

            if(copy==input){
                break;
            }
        }
        //대체가능
        //	do {
        //			N = ( ( N%10 )*10 ) + (( (N/10) + (N%10) )%10 );
        //			cnt++;
        //		} while (copy != N);

        System.out.println(cnt);
    }
}
