import java.util.Scanner;

public class 직사각형_별찍기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution();

    }


    static class Solution {
        public void solution () {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();

            for (int i = 0; i < m; i++) {
                for (int k = 0; k < n; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}