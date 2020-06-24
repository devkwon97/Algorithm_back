package codeup;

import java.util.Scanner;

public class CodeUp1098 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int length = 0;
        int direct = 0;
        int x = 0;
        int y = 0;

        //가로 세로 입력
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int[][] arr = new int [width][height];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = 0;
            }
        }//가로 세로 초기화

        // 판에 놓을 막대의 수
        int input = scanner.nextInt();
        for(int i=0; i<input; i++){
            //막대 길이, 방향, x좌표, y좌표
            length = scanner.nextInt();
            direct = scanner.nextInt();
            x = scanner.nextInt();
            y = scanner.nextInt();

            if(direct == 0){ // 막대 방향이 가로일때 행은 그대로 열만 변경
                for(int j=y-1; j<y-1+length; j++){ // 열변경 x
                    arr[x-1][j] = 1;
                }
            }else{
                for(int j=x-1; j<x-1+length; j++){
                    arr[j][y-1] =1; //행변경 x
                }
            }// 입력 정보로 막대기 놓기
        }
        for(int i=0; i<width; i++){
            for(int j=0;  j<height; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
