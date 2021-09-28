package h1;

import java.util.HashMap;

public class Fourth {

    public static void main(String args[]){

        String str1 ="aa";
        String str2 ="aab";

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i=0; i<str1.length();i++){
            map1.put(str1.charAt(i),map1.getOrDefault(str1.charAt(i),0)+1);
        }
        for(int i=0; i<str2.length();i++){
            map2.put(str2.charAt(i),map2.getOrDefault(str2.charAt(i),0)+1);
        }
        for(char c: map1.keySet()){
            if(map2.containsKey(c)){
                if(map2.get(c)!=map1.get(c)){
                   // return false;
                    System.out.println("False");
                }
            }
        }
        System.out.println("True");
        //return true;
    }
}
