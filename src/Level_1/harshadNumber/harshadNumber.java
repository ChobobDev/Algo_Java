package Level_1.harshadNumber;

public class harshadNumber {
    public static boolean solution(int x) {
        int copyOfx=x;
        int sumOfDigits =0;
        while(copyOfx!=0){
            sumOfDigits +=copyOfx%10;
            copyOfx/=10;
        }
        return x%sumOfDigits==0;
    }
}
