class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        backtrack(result,new StringBuilder(),0,0,n);
        return result;
    }
    void backtrack(ArrayList<String> result , StringBuilder sb , int open ,int close,int n){
        if(sb.length()==n*2){
            result.add(sb.toString());
            return ;
        }
        if(open < n){
            sb.append('(');
            backtrack(result,sb,open+1,close,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            backtrack(result,sb,open,close+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}