class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap< String , List<String>> outMap = new HashMap<>();
    for(String str: strs ){
        int freq[] = new int[26];
        for(char ch: str.toCharArray()){
            freq[ch-'a']++;
        }

        String key = Arrays.toString(freq);

        outMap.computeIfAbsent(key, k-> new ArrayList<>()).add(str); 
        
    }

    return new ArrayList<>(outMap.values());

    }

}
