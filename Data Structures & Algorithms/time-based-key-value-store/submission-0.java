class TimeMap {

    static class Pair{
        String value; 
        int timestamp; 

        Pair(String value , int timestamp){
            this.value = value;
            this.timestamp = timestamp;
        }
    }
    Map<String, List<Pair>> map;
    public TimeMap() {
         map = new HashMap<>();        
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key,k->new ArrayList<>()).add(new Pair(value,timestamp));
    }
    
    public String get(String key, int timestamp) {

        if( !map.containsKey(key))return "";
        List<Pair> list = map.get(key);
        int l = 0;
        int r = list.size()-1;
        String result = "";
        while(l<=r){
            int mid = (l + r)/2;
            if(list.get(mid).timestamp <= timestamp){
                result = list.get(mid).value;
                l = mid+1;
            }
            else{
                r = mid -1;
            }
        }
        return result;















        
    }
}
