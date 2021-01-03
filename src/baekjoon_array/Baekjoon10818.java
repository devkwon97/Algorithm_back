package baekjoon_array;
//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon10818 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int index = 0;
        int[] arr = new int[N]; // 배열 사용하면 최악의 경우 시간복잡도 N^2
        while(st.hasMoreTokens()){ // StringToken에 들어있는 모든 토큰들이 없어질때까지 배열에 모두 담기. hassMoreToekns는 토큰이 남았으면 true 없으면 false 반환
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        Arrays.sort(arr);
        System.out.print(arr[0]+" "+ arr[N-1]); // 인덱스는 입력 값보다 1이 작아야 맨 마지막 수
    }
}
