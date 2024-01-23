package Topic.Sort.sliver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Boj_1427_2 {

    // Arrays.sort,Comparator를 이용한 선택 정렬
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Integer A[] = new Integer[str.length()];

        for (int i = 0; i < str.length(); i++) {
            A[i] = Integer.parseInt(str.substring(i, i + 1));
        }

        Arrays.sort(A, Comparator.reverseOrder());

        for (int i = 0; i < str.length(); i++) {
            System.out.print(A[i]);
        }
    }
}
