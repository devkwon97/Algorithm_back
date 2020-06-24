package codeup;

import java.util.*;

public class CodeUp1095 {
//이상한 출석번호
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 범위 : 출석 부른횟수 = 1 ~ 10000 | 출석부른번호 - 1 ~ 23

        System.out.print("출석번호 부른 횟수 입력 :");
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        System.out.print("출석번호 부른 번호 입력 :");
        for(int i=0; i<n; i++){
            list.add(scan.nextInt());
        }
        scan.close();
        Collections.sort(list); //정렬
        System.out.print(list.get(0));//첫번째값 출력
    }
}
