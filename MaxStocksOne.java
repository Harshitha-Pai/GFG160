public class MaxStocksOne {
    public static void main(String[] args) {
       int prices[] = {7, 10, 1, 3, 6, 9, 2};
       System.out.println(maximumProfit(prices));
    }
    public static int maximumProfit(int prices[]) {

        int minSoFar = prices[0];
        int result = 0;

        for (int i = 1; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);

            result = Math.max(result, prices[i] - minSoFar);
        }
        return result;
    }
}
