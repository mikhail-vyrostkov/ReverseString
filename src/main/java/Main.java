public class Main {
    public static void main(String[] args) {
        char[] s = {'1', '2', '3', '4', '5' };
        Solution.reverseString(s);
        System.out.println(s);

    }

    public static class Solution {
        public static void reverseString(char[] s) {
            char a;
            for (int i = 0;i < s.length / 2; i++){
                a = s[i];
                s[i] = s[(s.length-1) - i];
                s[(s.length-1) - i] = a;
            }
        }
    }
}
