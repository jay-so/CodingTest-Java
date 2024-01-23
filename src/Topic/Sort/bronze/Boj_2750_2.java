package Topic.Sort.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Boj_2750_2 {
    //Array.sort함수 사용
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] store = new int[n];

        for (int i = 0; i < n; i++) {
            store[i] = sc.nextInt();
        }

        Arrays.sort(store);

        for (int num : store) {
            System.out.println(num);
        }
    }
}
