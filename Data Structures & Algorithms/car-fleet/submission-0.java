class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][2];

        for( int i= 0 ; i < n; i++)
        {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a,b) -> Integer.compare(b[0], a[0]));

        Deque<Double> stack = new ArrayDeque<>();

        for( int[] car: cars)
        {
            double time = (double)(target-car[0])/(car[1]);

            // if this car takes longer than the fleet ahead , it wont be grouped into the ahead fleet so we push another element for this into the stack depeicting another fleet, else we dont push anything , hence at the end stack.size() is the fleet count
            if(stack.isEmpty() || time> stack.peek())
            stack.push(time);

        }
        return stack.size();
    }
    
}
