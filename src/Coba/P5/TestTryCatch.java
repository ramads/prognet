package Coba.P5;

/**
 * created on 9/22/23 09:22
 * by ramads
 */

public class TestTryCatch {
    public static void main(String[] args) {
        int[] test = {1,0,2,4,5};

        for (int i = 0; i < test.length; i++) {
            try {
                System.out.println(5/test[i]);
            } catch (Exception e) {
                System.out.println("terjadi error: " + e.toString());
            }
        }
    }
}
