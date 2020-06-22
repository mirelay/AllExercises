package UdemyJavaCourse;

public class PalindromeNumber {

    public static void main (String[] args) {
        boolean isPalindrome = isPalindrome(-171171);
        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(int inputNumber) {
        int reverseNumber = 0;
        int remainder;
        int number = inputNumber;
        while(number != 0) {
            remainder = number % 10;
            reverseNumber = reverseNumber*10 + remainder;
            number /= 10;
        }
        if(inputNumber == reverseNumber) {
            return true;
        }
        return false;
    }
}
