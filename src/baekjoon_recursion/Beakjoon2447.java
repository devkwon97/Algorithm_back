package baekjoon_recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Beakjoon2447 {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());

        arr = new char[input][input];

        star(0, 0, input, false);

        for(int i=0; i<input; i++){
            bw.write(arr[i]);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    static void star(int x, int y, int input, boolean blank){


        // 공백일 경우
        if(blank){
            for(int i=x; i<x+input; i++){
                for(int j=y; j<y+input; j++){
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        // 더이상 나눌 수 없는 블록일 경우
        if(input == 1){
            arr[x][y] = '*';
            return;
        }

        int size = input / 3;
        int count = 0;
        for(int i=x; i<x+input; i+=size){
            for(int j=y; j<y+input; j+=size){
                count++;
                if(count == 5){
                    star(i, j, size, true);
                }else{
                    star(i, j, size, false);
                }
            }
        }
    }
}
