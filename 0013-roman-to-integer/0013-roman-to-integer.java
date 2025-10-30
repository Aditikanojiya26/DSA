class Solution {
    public static int value(char c){
        switch(c){
                case 'I': 
                    return 1;
                case 'V' :
                    return 5;
                case 'X' :
                    return 10;
                case 'L' :
                    return 50;
                case 'C' :
                    return 100;
                case 'D' :
                    return 500;
                case 'M' :
                    return 1000;
            }
            return 0;
    }
    public int romanToInt(String s) {
        int prev=value(s.charAt(0));
        int sum=prev;
        for(int i=1;i<s.length();i++){
            int current=value(s.charAt(i));
            if(prev<current)sum=(sum-prev)+(current-prev);
            else sum+=current;
            prev=current;
        }
        return sum;
    }
}