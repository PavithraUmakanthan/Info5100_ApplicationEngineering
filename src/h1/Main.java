package h1;


import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String args[]) {

        System.out.println(sumOfUniqueElements());

        int[] result = squaresInNonDecreasingOrder();
        for(int i:result)
            System.out.print(i+" ");
        System.out.println();

        System.out.println(firstNonRepeatedInteger());

        System.out.println(constructSubString());

        System.out.println(letterFollowedByDigit());

    }

    public static int sumOfUniqueElements() {

        int nums[] = {1, 1, 1, 1, 1};
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {

                if (nums[j] != nums[i]) {
                    if (j == nums.length - 1) {
                        result += nums[i];
                    }
                }
            }
        }
        return result;
    }

    public static int[] squaresInNonDecreasingOrder() {

        int nums[] = {-4, -2, -1, 0};
        int result[] = new int[nums.length];
        int num = 0;

        for (int i = 0; i < nums.length; i++) {
            num = nums[i] * nums[i];
            result[i] = num;
        }
        int temp;
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] > result[j]) {
                    temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }

    public static int firstNonRepeatedInteger() {

        int[] arr = {2, 3, 4, 2, 2, 3, 5, 7};
        int result;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] != arr[i]) {
                    if (j == arr.length - 1) {
                        return arr[i];
                    }
                }
            }
        }
        return -1;
    }

    public static boolean constructSubString() {

        String str1 = "aa";
        String str2 = "aab";

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++){
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++){
            map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);
        }
        for (char c : map1.keySet()){
            if (map2.containsKey(c)){
                if (map2.get(c) != map1.get(c)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean letterFollowedByDigit(){
        String str1 = "A2bb2d4";

        if(Character.isDigit(str1.charAt(0))){
            for (int i = 0; i < str1.length(); i++) {
                if (i%2 != 0 && Character.isDigit(str1.charAt(i))) {
                    return false;
                }
                else if (i%2 == 0 && Character.isLetter(str1.charAt(i))){
                    return false;
                }
            }
            return true;
        }else if(Character.isLetter(str1.charAt(0))) {
            for (int i = 0; i < str1.length(); i++) {
                if (i % 2 != 0 && Character.isLetter(str1.charAt(i))) {
                    return false;
                }
                if (i % 2 == 0 && Character.isDigit(str1.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}








