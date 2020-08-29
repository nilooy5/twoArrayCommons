public class CommonNumbers {
    public static void main(String[] args) {
        int[] numArray1 = {6, 34, 5, 1, 9};
        int[] numArray2 = {6, 1, 8, 34, 5};
        int count = 0;
        // Outer loop
        for (int j : numArray1) {
            for (int k : numArray2) {// inner loop
                if (j == k) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
