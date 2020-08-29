public class CommonNumbers {
    public static void main(String[] args) {
        int[] numArray1 = {1, 4, 5};
        int[] numArray2 = {6, 1, 8, 34, 5};
        int count = 0;
        // Outer loop
        for (int j : numArray1) {
            for (int k : numArray2) {// inner loop
                if (j == k) {
                    System.out.println(j);
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
