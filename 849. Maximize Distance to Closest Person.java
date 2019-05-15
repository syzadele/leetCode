class Solution {
    public int maxDistToClosest(int[] seats) {
        int maxDistance = 0;
        int first = -1;
        
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1 && first == -1) {
                first = i;
                if ((int)i+1/2 > maxDistance) {
                    maxDistance = (int)i+1/2;
                }
            } 
            if (seats[i] == 1 && first != -1) {
                if ((int)(i - first)/2 > maxDistance) {
                    maxDistance = (int)(i - first)/2;
                }
                first = i;
            }
            if (seats[i] == 0 && i == seats.length - 1) {
               
                    if (first != -1) {
                        if (seats.length - 1 - first > maxDistance) {
                            maxDistance = seats.length - 1 - first;
                        }
                    } else {
                        if (seats.length - 1 > maxDistance) {
                            maxDistance = seats.length - 1;
                        }
                    }
            }
        }
       
        return maxDistance;
    }
}
