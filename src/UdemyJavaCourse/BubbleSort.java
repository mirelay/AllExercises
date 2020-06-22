package UdemyJavaCourse;

public class BubbleSort {
    public static void main (String[] args) {
        int[] intArray1 = new int[9];
        for(int i=0; i<9; i++) {
            double randNumber = 100*Math.random();
            intArray1[i] = (int)randNumber;
        }

        System.out.println("Input array: ");
        printArray(intArray1);

        int[] intArray2 = sortedArray(intArray1);

        System.out.println("Sorted array: ");
        printArray(intArray2);
    }

    public static int[] sortedArray(int[] intArray) {
        for (int j=1; j<intArray.length; j++) {
            for (int i=0; i<intArray.length-j; i++) {
                if(intArray[i]>intArray[i+1]) {
                    int medium = intArray[i];
                    intArray[i] = intArray[i+1];
                    intArray[i+1] = medium;
                }
            }
        }
        return intArray;
    }

    public static void printArray (int[] intArray) {
        String comma = ",";
        int arrayLength = intArray.length;
        for (int i=0; i<arrayLength; i++) {
            if(i==arrayLength-1) {
                comma = ";";
                System.out.print(intArray[i] + comma + "\n");
                break;
            }
            System.out.print(intArray[i] + comma);
        }
    }
}
