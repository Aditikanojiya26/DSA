class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int curMoney = money;
        curMoney-=prices[0];
        curMoney-=prices[1];
        if( curMoney < 0) return money;
        return curMoney;
    }
}