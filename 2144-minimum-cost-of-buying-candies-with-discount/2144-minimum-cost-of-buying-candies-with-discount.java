class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int totalCost = 0;
        for (int i = cost.length - 1; i >= 0; i -= 3) {
            totalCost += cost[i]; // First candy
            if (i - 1 >= 0) {
                totalCost += cost[i - 1]; // Second candy
            }
        }

        return totalCost;
    }
}
    