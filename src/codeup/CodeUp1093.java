package codeup;

public class CodeUp1093 {

    public static void main(String[] args){

        int total = 0;

        for(int i=0; i<=5; i++){
            for(int j=1; j<=i; i++){
                total++;
            }
        }
        System.out.print(total);
    }
}
