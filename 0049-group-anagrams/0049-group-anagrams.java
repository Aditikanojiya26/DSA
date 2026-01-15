class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for( String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            } 
            map.get(key).add(s);
            //map.get(key)-->return List so now add method to add something
        }
        //System.out.println(map.values());
        return new ArrayList<>(map.values());
    }
}
