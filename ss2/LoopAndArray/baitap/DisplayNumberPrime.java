package ss2.LoopAndArray.baitap;

public class DisplayNumberPrime {
    boolean checkPrime(int n){
        boolean flag = true;
        if(n < 2)
            flag = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (flag) {
                if(n % i == 0) {
                    flag = false;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        DisplayNumberPrime a = new DisplayNumberPrime();
        int numbers = 20;
        int count = 0;
        for (int i = 0; i < 1000; i++) {
            if(a.checkPrime(i) == true){
                System.out.print(i + " ");
                count ++;
            }
            if(count == numbers){
                break;
            }
        }
    }
}
