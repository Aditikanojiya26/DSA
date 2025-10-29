class Solution {
    public String frequencySort(String s) {
        StringBuilder sb =new StringBuilder();
        char[] arr= new char[256];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]+=1;
        } 
        int maxChar=s.length();
        for(int j=0;j<s.length();j++){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==maxChar) sb.append(String.valueOf((char)i).repeat(maxChar));
            }
            maxChar--;
        }
        System.out.print(sb.toString());
        return sb.toString();
    }
}