class Solution {
    public List<String> summaryRanges(int[] nums) {

        int n = nums.length;
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = nums[i];

            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            if (start == nums[i])
                ans.add("" + start);
            else
                ans.add(start + "->" + nums[i]);
        }
        return ans;
    }
}
