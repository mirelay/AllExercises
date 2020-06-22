package UdemyJavaCourse;

public class FlourPacker {

    public static void main (String[] args) {
        boolean canPack = canPack(0, 5, 6);
        System.out.println(canPack);
    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigPack = 5;
        int smallPack = 1;
        if(bigCount*bigPack + smallCount*smallPack >= goal) {
            if(smallCount*smallPack >= goal%bigPack)
                return true;
        }
        return false;
    }

    public static boolean canPack2 (int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigPack = 5;
        int smallPack = 1;
        if(smallCount*smallPack >= goal%bigPack)
            return true;
        return false;
    }
}
