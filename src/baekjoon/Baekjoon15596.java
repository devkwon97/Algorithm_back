package baekjoon;
//정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
import java.io.IOException;

public class Baekjoon15596 {

    public static long add(int[] a){
        long sum = 0; //a 배열 정수 합
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        return sum;
    }
    public static void main(String[] args)throws IOException {

        int[] num = {50,20,30};
        long num1 = add(num);
        System.out.println(num1);
    }
}
