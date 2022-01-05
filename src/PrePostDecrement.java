public class PrePostDecrement {
    public static void main(String[] args) {
        // Pre-increment
        int i = 1;
        int p = --i;
        System.out.println("i: " + i + " p: " + p); // i: 2 p: 2
        // Post-increment
        int j = 1;
        int q = j--;
        System.out.println("j: " + j + " q: " + q ); // j: 2 q: 1
    }
}
