public class 나머지가_1이되는_수_찾기 {

    public static void main(String[] args) {

    }

    private static class Solution {
        // 2부터 시작해서 ++
        public int solution(int n) {
            for(int i=2; i<n; i++){
                if(n % i == 1){
                    return i;
                }
            }
            return n;
        }
    }
}