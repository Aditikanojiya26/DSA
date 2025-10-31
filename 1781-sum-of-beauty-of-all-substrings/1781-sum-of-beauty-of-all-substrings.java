class Solution {
    public int beautySum(String s) {
        int totalBeauty=0;
        ArrayList<String> str = new ArrayList<>(); 
        for(int i=0 ; i<s.length()-1; i++){
            for(int j=i+1 ; j<s.length() ; j++){
                str.add(s.substring(i,j+1));
            }
        }
        for(int i=0 ; i<str.size() ;i++){
            int[] freq=new int[26];
            for(char ch : str.get(i).toCharArray()) freq[ch-'a']+=1;
            int max=0, min = Integer.MAX_VALUE;;
            for(int j=0;j<26;j++){
                if (freq[j] > 0) {
                    max = Math.max(max, freq[j]);
                    min = Math.min(min, freq[j]);
                }
            }
            totalBeauty+=(max-min);
        }
        return totalBeauty;
    }

}