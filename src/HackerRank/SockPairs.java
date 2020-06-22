package HackerRank;

public class SockPairs {
    public static void main(String[] args) {
        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int[] sockColors = new int[n];
        int sockPairs = sockPairs(n, ar);
        System.out.println(sockPairs);

    }

    public static int sockPairs(int n, int[] ar) {
        int sockPairs = 0;
        int[] sockColors = new int[100];
        for(int i = 0; i < n; i++) {
            int sockColor = ar[i];
            sockColors[sockColor-1]++;
            if(sockColors[sockColor-1] % 2 == 0) {
                sockPairs++;
            }
        }
        return sockPairs;
    }
}
