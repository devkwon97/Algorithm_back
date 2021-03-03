package baekjoon_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon7568 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Num = Integer.parseInt(br.readLine());
        int[][] arr = new int[Num][2];

        String[] splits;
        for(int i = 0; i < Num; i++) {
            splits = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(splits[0]); // [i][0] 몸무게
            arr[i][1] = Integer.parseInt(splits[1]); // [i][1] 키
        }

        for(int i=0; i<Num; i++) {
            int ranking = 1;

            for(int j=0; j<Num; j++) {
                if(i==j) {
                    continue;
                }
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    ranking++;
                }
            }
            System.out.print(ranking + " ");
        }
    }
}
