package ss2.LoopAndArray.baitap;

public class IsPrimeSmaller100 {
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

        IsPrimeSmaller100 a = new IsPrimeSmaller100();
        for (int i = 2; i < 100; i++) {
            if(a.checkPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }
}
