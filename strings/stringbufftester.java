package strings;

import java.util.*;

public class stringbufftester {

    public static void main(String[] args) {
        String a = "Abishek";
        String b = new String("Abishek");
        // stringbufftester s = new stringbufftester();

        StringBuilder sb = new StringBuilder(a);
        sb.replace(2, 6, "-");
        System.out.println(sb.toString());
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        System.out.println(String.valueOf(arr));
        System.out.println(sb.toString().toUpperCase());

    }
}
