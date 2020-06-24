package baekjoon;
// 백준 1920 수 찾기

import java.util.HashSet;
import java.util.Scanner;

public class BaekJoon1920 {
    public static void main(String[] args){

        int N;
        int M;
        int answer;

        Scanner scan = new Scanner(System.in);
        N = scan.nextInt(); //N의 정수 갯수입력

        HashSet<Integer> hash = new HashSet<Integer>();
        for(int i=0; i<N; i++) {
            hash.add(scan.nextInt()); // N의 정수 Hashset 안에 담기
        }
        M = scan.nextInt();
        int arr[] = new int[M];
        for(int i=0; i<M; i++){
            arr[i] = scan.nextInt(); // M 의 정수 입력
        }

        for(int i=0; i<M; i++){
            if(hash.contains(arr[i])){ //M개의 정수들이 A에 드러있는지 존재체크
                answer = 1;
            }else{
                answer = 0;
            }
            System.out.println(answer);
        }
    }
}
