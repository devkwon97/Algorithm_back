package codeup;

import java.util.Scanner;

public class CodeUp1096 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("흰돌 갯수 입력 : ");
        int n = scan.nextInt();
        int[][] arr = new int[19][19];

        System.out.println("좌표 입력");

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = 0;
            }
        }//바둑판 0으로 초기화

        //바둑알이 올려진 좌표
        for(int i=0; i<n; i++ ){
            arr[scan.nextInt() - 1][scan.nextInt() - 1] = 1;
        }

        // 흰 바둑알이 올려진 곳 모두 1로 저장후 바뀐 바둑판 배열 arr 출력
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
