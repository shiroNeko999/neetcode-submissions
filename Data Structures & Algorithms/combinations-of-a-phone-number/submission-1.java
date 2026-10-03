class Solution {
    String[] map = {
    "",     // 0
    "",     // 1
    "abc",  // 2
    "def",  // 3
    "ghi",  // 4
    "jkl",  // 5
    "mno",  // 6
    "pqrs", // 7
    "tuv",  // 8
    "wxyz"  // 9
};  
    public List<String> letterCombinations(String digits) {
        StringBuilder sub = new StringBuilder();
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) {
            return res;
        }

        dfs(0, sub, res, digits);
        return res;
    }

    public void dfs(int index, StringBuilder sub, List<String> res, String digits ){
    if(index == digits.length()){
        res.add(sub.toString());
        return;
    }

    String wordGroup = map[digits.charAt(index)-'0'];

    for(int i = 0; i < wordGroup.length();i++){
        sub.append(wordGroup.charAt(i));
        dfs(index+1, sub, res, digits);
        sub.deleteCharAt(sub.length()-1);
    }
        
    }
}
