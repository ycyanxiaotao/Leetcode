class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = "" + nums[i];
        }
        Arrays.sort(strs, (a, b) -> {
            String ab = a + b;
            String ba = b + a;
            return ba.compareTo(ab);
        });
        for (String str : strs) {
            sb.append(str);
        }
        int k = 0;
        while (sb.charAt(k) == '0' && k < sb.length() - 1) {
            k++;
        }
        return sb.substring(k);
    }
}