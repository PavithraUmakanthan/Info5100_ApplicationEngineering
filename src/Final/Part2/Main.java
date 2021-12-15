package Final.Part2;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] wordList) {
        if (wordList.length == 0) return new ArrayList();
        Map<String, List> map = new HashMap<String, List>();
        for (String word : wordList) {
            char[] charArr = word.toCharArray();
            Arrays.sort(charArr);
            String anagram = String.valueOf(charArr);
            if (!map.containsKey(anagram)) {
                map.put(anagram, new ArrayList());
            }
            map.get(anagram).add(word);
        }
        return new ArrayList(map.values());
    }
}
