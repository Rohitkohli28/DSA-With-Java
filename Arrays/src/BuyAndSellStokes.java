public class BuyAndSellStokes {
    public static int maxProfit(int prices[]){
        if (prices == null || prices.length < 2){
            return 0;
        }
        int minPrice = prices[0]; // Minimum prices seen so far
        int maxProfit = 0; // Maximum profit possible

        for (int i=1; i<prices.length; i++){
            // Update minimum prices if current price is lower
            if (prices[i] < minPrice){
                minPrice = prices[i];
            } else {
                // Otherwise, calculate profit if we sell today
                int currentProfit = prices[i];
                if(currentProfit > maxProfit){
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BuyAndSellStokes buy = new BuyAndSellStokes();
        int[] prices1 = {7,1,5,3,6,4};
        System.out.println(buy.maxProfit(prices1));
    }
}
