public class buysellstock {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (buyPrice < price) {
                int profit = price - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = price;
            }
        }

        System.out.println(maxProfit);
    }
}
