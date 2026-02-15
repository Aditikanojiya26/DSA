class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map = new HashMap<>();
        for( int i =0 ;i < stones.length();i++){
            char ch = stones.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int result = 0 ;
        for(int i = 0 ; i < jewels.length(); i++){
            if(map.containsKey(jewels.charAt(i))) result+=map.get(jewels.charAt(i));
        }
        return result;
    }
}