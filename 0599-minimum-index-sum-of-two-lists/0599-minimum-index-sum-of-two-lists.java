import java.util.*;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        HashMap<String, Integer> map = new HashMap<>();
        int sum = Integer.MAX_VALUE;
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < list1.length; i++){
            map.put(list1[i], i);
        }

        // check list2
        for(int i = 0; i < list2.length; i++){
            
            if(map.containsKey(list2[i])){
                
                int currSum = i + map.get(list2[i]);

                if(currSum < sum){
                    sum = currSum;
                    list.clear();
                    list.add(list2[i]);
                }
                else if(currSum == sum){
                    list.add(list2[i]);
                }
            }
        }

        return list.toArray(new String[0]);
    }
}
