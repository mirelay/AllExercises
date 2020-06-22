package UdemyJavaCourse;

public class LargestPrime {
    public static void main (String[] args) {
        int largestPrime = getLargestPrime(17);
        System.out.println(largestPrime);
    }

    public static int getLargestPrime (int number) {
        if(number < 0) {
            return -1;
        }

        for (int i = number; i > 1; i--) {
            if(number%i == 0) {
                boolean prime=true;
                for (int j = 2; j <= i/2; j++) {
                    if(i%j == 0) {
                        prime = false;
                        break;
                    }
                }
                if(!prime) {
                    continue;
                }
                return i;
            }
        }
        return -1;
    }
}
