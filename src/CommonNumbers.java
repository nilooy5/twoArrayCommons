import java.util.*;
public class CommonNumbers {
    public static void main(String[] args) {
        int[] numArray1 = {6, 34, 5, 1, 9, 1};
        int[] numArray2 = {6, 1, 8, 34, 5};

        HashSet<String> unique = new HashSet<>();
//        int count = 0;

        for (int j : numArray1) {
            for (int k : numArray2) {
                if (j == k) {
//                    System.out.println(j);
                    unique.add(Integer.toString(k));
//                    count++;
                    break;
                }
            }
        }
        // System.out.println(count);
        System.out.println("total unique common integers: " + unique.size());
    }
}
