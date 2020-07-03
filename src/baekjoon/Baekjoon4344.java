package baekjoon;
//대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon4344 {
    public static void main(String[] args)throws IOException {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        double avg;

        //줄 돌리기
        for(int i=0; i<count; i++){
            //케이스마다 학생 수로 int 배열 선언
            int[] student = new int[scan.nextInt()];
            int total = 0; // 학생 전체 점수
            int high = 0; // 평균 이상 학생 수
            // 학생들 점수 입력 받는 for문
            for(int j=0; j<student.length; j++){
                student[j] = scan.nextInt();
                total += student[j]; // 총 점수 계산
            }

            avg = (double)total/student.length;

            //학생들 개별 평균 점수 이상인지 검사
            for(int k=0; k<student.length; k++){
                if(student[k]>avg){
                    high++;
                }
            }
            System.out.printf("%.3f", 100.0 * high/student.length);
            System.out.println("%");
        }
    }
}
