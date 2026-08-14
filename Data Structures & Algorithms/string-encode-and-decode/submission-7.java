class Solution {

    public String encode(List<String> strs) {
        String encoded="";
        for(String str: strs)
        {
            encoded =encoded + str.length() + "#" + str;
        }
        return encoded;

    }

    public List<String> decode(String str) {
        ArrayList<String> list = new ArrayList<>();
        int i =0;
        int j;
        while( i< str.length()){
            j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            int start = j+1;
            int end = start+ length;
            list.add(str.substring(start,end));
            i = end;
        }
        return list;
    }
}
