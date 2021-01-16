package baekjoon_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2231{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int input_change = input - (String.valueOf(input).length() * 9); // 각 자리수 1~9니깐 x9

        while (decomposition(input_change) != input && input_change < input) {
            input_change++;
        }

        System.out.println(input_change != input ? input_change : 0);
    }

    public static int decomposition(int input) {
        int sum = input;
        while (input > 0) {
            sum += input % 10;
            input /= 10;
        }
        return sum;
    }
}
