public class MaxStocksMultiple {

    public static void main(String[] args) {
        int[] prices = { 4, 2, 2, 2, 4};
        System.out.println(maximumProfit(prices));
    }
    static int maximumProfit(int[] prices) {
        int result = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                    result += prices[i] - prices[i - 1];
        }

            return result;
    }

}
