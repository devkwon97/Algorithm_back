package baekjoon_bruteforce;

import java.util.Scanner;

public class Baekjoon7568 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int Num = in.nextInt();
        int[][] arr = new int[Num][2];

        for(int i = 0; i < Num; i++) {
            arr[i][0] = in.nextInt(); // [i][0] 몸무게
            arr[i][1] = in.nextInt(); // [i][1] 키
        }

    }
}
