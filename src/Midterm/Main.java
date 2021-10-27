package Midterm;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Printer p1;
        // refers to the only object of Database
        p1 = Printer.getInstance();

        p1.getConnection();
    }


    //Question 3 Question 3) For the given array, return the sum of all the numbers which are repeated.
    //
    //Ex: Input : array = {1,3,-1,3,4,-1}
    //
    //      Output : 3 + (-1) = 2


    int[] array = {1, 3, -1, 3, 4, -1};

    public static int sumOfRepeated(int[] array) {
        int temp = 0;
        for (int i = 0; i <= array.length; i++) {
            for (int j = i + 1; j <= array.length; j++) {
                if (array[i] == array[j]) {
                    temp = array[i];
                }
            }
        }
        return temp;
    }

    //Question 4) Given a string s, find the longest substring without repeating characters.
    //Ex: Input: s = "abcabcbb"
   // Output: abc

        String s = "abcabcbb";

        public String longestSubstring(String s) {
            int result = 0,i=0;
            int n = s.length(), ans = 0;
            Map<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (map.containsKey(s.charAt(j))) {
                    i = Math.max(map.get(s.charAt(j)), i);
                }
                result = Math.max(ans, j - i + 1);
                map.put(s.charAt(j), j + 1);
            }
            return s.substring(i,ans+i);
        }
}



