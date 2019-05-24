class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length == 1) return false;
        HashMap<Integer, Integer> map = new HashMap();
        for (int i : deck) {
            map.put(i, map.getOrDefault(i,0)+1); 
        }
        Set<Integer> keyset = map.keySet();
        int size = 0;
        
        for (int key : keyset) {
            
           if (size != 0 && map.get(key) != size) {
                int temp=0;
                int b = map.get(key);
                int a = size;
               
                while(b!=0){
                    temp=b;
                    b=a%b; 
                    a=temp;
                }
             
               if (a == 1) {
                       return false;
                }
           }
            size = map.get(key);
            
        }
        return true;
    }
}
