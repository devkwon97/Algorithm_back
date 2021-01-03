package baekjoon_recursion;

import java.io.*;

public class Baekjoon10872 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        System.out.println(fact(input));
        //1=1x1 2=1x2 3=1+2+3 4
    }
    public static int fact(int num){
        if(num==0 || num==1){
            return 1;
        }else {
            return fact(num-1)*num;
        }
    }
}
