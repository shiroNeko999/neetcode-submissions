class MinStack {
     List<Integer> stamck;
    public MinStack() {
        stamck = new ArrayList<>();
    }
    
    public void push(int val) {

        stamck.add(val);

        
    }
    
    public void pop() { 

            stamck.remove(stamck.size()-1);
            
        
        
    }
    
    public int top() {

        return stamck.get(stamck.size() -1);
         
    }
    
    public int getMin() {

        int min = Integer.MAX_VALUE;  

        for(int i= 0;i< stamck.size(); i++){
             min = Math.min(min, stamck.get(i));
        }
        return min;
    }
}
