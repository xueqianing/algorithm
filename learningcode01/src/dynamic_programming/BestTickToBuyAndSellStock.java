package dynamic_programming;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
 * 注意：你不能在买入股票前卖出股票。
 *
 * 示例 1:
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
 * 示例 2:
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 */

/**
 * 遍历数组，以当天价格卖出，如果大于之前的最大利润，则更新；而最优的买入点，应该是到目前为止的历史最低价格。每天的价格可能会影响到目前为止的历史最低价格。
 */
public class BestTickToBuyAndSellStock {
        public static int maxProfit(int[] prices){
            int maxProfit = Integer.MIN_VALUE;
            for (int i = 0; i < prices.length; i++) {
                final int currentPrice = prices[i];
                for (int j = i+1; j < prices.length; j++) {
                    final int currentProfit = currentPrice - prices[j];
                    if(currentProfit > maxProfit){
                        maxProfit = currentProfit;
                    }
                }
            }
            return maxProfit;
        }


    public static int maxProfit2(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        // 遍历数组，以每天的价格作为卖出点，进行比较
        for (int i = 0; i < prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit2(prices));
    }
}
