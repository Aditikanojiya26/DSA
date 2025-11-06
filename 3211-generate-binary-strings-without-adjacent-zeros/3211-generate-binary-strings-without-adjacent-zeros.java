class Solution {
    public void generate( int n , String str , List<String> result){
        if(str.length()==n){
            result.add(str);
            return ;
        }
        if (str.length() == 0 || str.charAt(str.length() - 1) != '0') {
            generate(n, str + '0', result);
        }
        generate(n,str+'1',result);
    }
    public List<String> validStrings(int n) {
        List<String> result=new ArrayList<>();
        generate(n,"",result);
        return result;
    }
}