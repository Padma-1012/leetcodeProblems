class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if(start>destination){
            start = destination + start - (destination = start);
        }
        int t =0, p =0;
        for(int i =0; i<distance.length; i++){
            t += distance[i];
            if(i>=start && i<destination){
                p += distance[i]; 
            }
        }
        return Math.min(p, t-p);
    }
}