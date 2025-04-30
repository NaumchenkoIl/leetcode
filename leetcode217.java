import java.util.HashSet;

public class leetcode217 {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> povtorel = new HashSet<>();
            for (int num : nums) {
                if (povtorel.contains(num)) {
                    return true;
                }
                povtorel.add(num);
            }
            return false;
        }
    }
}
