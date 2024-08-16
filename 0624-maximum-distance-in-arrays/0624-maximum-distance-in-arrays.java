class Solution {
    public int maxDistance(List<List<Integer>> a) {
        int maxDiff = 0;
        int start = a.get(0).get(0);
        int end = a.get(0).get(a.get(0).size() - 1);
        
        for (int i = 1; i < a.size(); i++) {
            int currStart = a.get(i).get(0);
            int currEnd = a.get(i).get(a.get(i).size() - 1);
            maxDiff = Math.max(maxDiff, Math.abs(currStart - end));
            maxDiff = Math.max(maxDiff, Math.abs(currEnd - start));
            start = Math.min(start, currStart);
            end = Math.max(end, currEnd);
        }
        
        return maxDiff;
    }
}
