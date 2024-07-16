public class bestTimToBuySto {
    public static int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            max=Math.max(max,prices[i]-min);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a={2,7,11,15};
        System.out.println(maxProfit(a));
    }
}
