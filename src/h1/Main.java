package h1;

import java.util.HashMap;

public class Main {

    public static void main(String args[]) {

        int nums[] = {1, 1, 1, 1, 1};
        System.out.println(sumOfUniqueElements(nums));

        int nums1[] = {-4, -2, -1, 0};
        int[] result = squaresInNonDecreasingOrder(nums1);
        for(int i:result)
            System.out.print(i+" ");
        System.out.println();

        int[] arr = {2, 3, 4, 2, 2, 3, 5, 7};
        System.out.println(firstNonRepeatedInteger(arr));

        String str1 = "aa";
        String str2 = "aab";
        System.out.println(constructSubString(str1,str2));

        String str3 = "A2bb2d4";
        System.out.println(letterFollowedByDigit(str3));

    }

    public static int sumOfUniqueElements(int[] nums) {

        int result = 0;
        if(nums.length == 0){
            return 0;
        }
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

    public static int[] squaresInNonDecreasingOrder(int[] nums){

        int result[] = new int[nums.length];
        int num = 0;
        if(nums.length == 0){
            int res[] = new int[2];
            return res;
        }
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

    public static int firstNonRepeatedInteger(int[] arr) {

        int result;
        if(arr.length == 0){
            return 0;
        }
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

    public static boolean constructSubString(String str1, String str2) {

        if(str1 == null || str2 == null){
            return false;
        }
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
    public static boolean letterFollowedByDigit(String str1){

        if(str1 == null){
            return false;
        }
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








