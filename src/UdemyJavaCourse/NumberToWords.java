package UdemyJavaCourse;

public class NumberToWords {

    public static void main (String[] args) {
        numberToWords(1405);
    }

    public static void numberToWords (int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }
        int reverseNumber = reverse(number);

        int digit;
        int digitCount = getDigitCount(number);
        int digitReverseCount = getDigitCount(reverseNumber);
        String digitWord;
        for(int i=digitCount; i>0; i--) {
            digit = reverseNumber%10;
            reverseNumber /= 10;
            switch (digit) {
                case 0:
                    digitWord = "Zero";
                    break;
                case 1:
                    digitWord = "One";
                    break;
                case 2:
                    digitWord = "Two";
                    break;
                case 3:
                    digitWord = "Three";
                    break;
                case 4:
                    digitWord = "Four";
                    break;
                case 5:
                    digitWord = "Five";
                    break;
                case 6:
                    digitWord = "Six";
                    break;
                case 7:
                    digitWord = "Seven";
                    break;
                case 8:
                    digitWord = "Eight";
                    break;
                case 9:
                    digitWord = "Nine";
                    break;
                default:
                    digitWord = "None";
            }
            System.out.println(digitWord);
        }
    }

    public static int reverse (int number) {
        int reverseNumber = 0;
        int remainder;
        while(number != 0) {
            remainder = number % 10;
            reverseNumber = reverseNumber*10 + remainder;
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount (int number) {
        if(number<0) {
            return -1;
        }
        int count = 0;
        do {
            count++;
            number /= 10;
        } while(number > 0);
        return count;
    }

    public static String getDigitWord (int digit) {
        switch (digit) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "None";

        }
    }
}

/*
int reverseNumber = reverse(1000);
        System.out.println(reverseNumber);
        int digitCount = getDigitCount(1000);
        int digitReverseCount = getDigitCount(reverseNumber);
        System.out.println("Number count = " + digitCount + " and reverse number count = " + digitReverseCount);
 */
