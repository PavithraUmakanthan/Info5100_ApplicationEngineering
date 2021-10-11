package h2_Leetcode;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = transposeMatrix(matrix);
        for (int[] i : result) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes", "practice", "coding"};
        String word1 = "coding";
        String word2 = "practice";
        System.out.println(shortestWordDistance(wordsDict, word1, word2));

        int[] nums = {0, 1, 0, 3, 12};
        int[] result1 = moveZeroes(nums);
        for (int i : result1) {
            System.out.print(i);
        }
        System.out.println();

        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result2 = rotateMatrix(matrix1);
        for (int[] i : result2) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        String s = "egg";
        String t = "add";
        System.out.println(isomorphicString(s, t));

        String num1 = "11";
        String num2 = "123";
        System.out.println(addStrings(num1, num2));

        String a = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome(a));

        String b = "the sky is blue";
        System.out.println(reverseWords(b));

        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(stringCompression(chars));

        int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralMatrix(matrix2));
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0 || matrix == null) {
            return null;
        }
        int[][] result = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static int shortestWordDistance(String[] array, String word1, String word2) {
        int min = array.length + 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(word1)) {
                for (int j = 0; j < array.length; j++) {
                    if (array[j].equalsIgnoreCase(word2)) {
                        min = Math.min(Math.abs(i - j), min);
                    }
                }
            }
        }
        return min;
    }

    public static int[] moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return nums;
    }

    public static int[][] rotateMatrix(int[][] matrix) {

        if (matrix.length == 0 || matrix[0].length == 0 || matrix == null) {
            return null;
        }

        int temp = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i != j && i < j) {
                    System.out.println(i + " " + j + " " + matrix[i][j]);
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        int x = 0;
        int y = matrix[0].length - 1;
        int temp1 = 0;
        while (x <= y) {
            for (int k = 0; k < matrix.length; k++) {
                temp1 = matrix[k][x];
                matrix[k][x] = matrix[k][y];
                matrix[k][y] = temp1;
            }
            x++;
            y--;
        }
        return matrix;
    }

    public static boolean isomorphicString(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);

            if (!map.containsKey(c1)) {
                map.put(c1, i);
            }

            newString.append(Integer.toString(map.get(c1)));
            newString.append(" ");
        }
        return !(newString.toString().equals(t));
    }

    public static String addStrings(String num1, String num2) {
        if (num1 == null || num2 == null) return null;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int a = num1.length() - 1;
        int b = num2.length() - 1;

        while (a >= 0 || b >= 0) {
            int n1 = a >= 0 ? num1.charAt(a) - '0' : 0;
            int n2 = b >= 0 ? num2.charAt(b) - '0' : 0;
            int sum = n1 + n2 + carry;
            carry = sum > 9 ? 1 : 0;
            sb.insert(0, sum % 10);
            a--;
            b--;
        }
        if (carry == 1) sb.insert(0, 1);
        return sb.toString();
    }

    public static boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            while (start <= end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (start <= end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (start <= end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static String reverseWords(String s) {
        String[] tmp = s.split("\\s");
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= tmp.length; i++){
            if(tmp[tmp.length - i].equals("")){
                continue;
            }
            sb.append(tmp[tmp.length - i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static int stringCompression(char[] chars) {
        int j = 0, i = 0;
        while(i < chars.length){
            char c = chars[i];
            int count = 0;
            while(i < chars.length && chars[i] == c){
                i++;
                count++;
            }
            chars[j++] = c;
            if(count != 1)
                for(char ch : Integer.toString(count).toCharArray())
                    chars[j++] = ch;
        }
        return j;
    }
    public static List<Integer> spiralMatrix(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if(matrix.length == 0 || matrix[0].length == 0) return result;
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while(true){
            for(int i = left; i <= right; i++) result.add(matrix[top][i]);
            top++;
            if(left > right || top > bottom) break;

            for(int i = top; i <= bottom; i++) result.add(matrix[i][right]);
            right--;
            if(left > right || top > bottom) break;

            for(int i = right; i >= left; i--) result.add(matrix[bottom][i]);
            bottom--;
            if(left > right || top > bottom) break;

            for(int i = bottom; i >= top; i--) result.add(matrix[i][left]);
            left++;
            if(left > right || top > bottom) break;
        }
        return result;
    }
}




