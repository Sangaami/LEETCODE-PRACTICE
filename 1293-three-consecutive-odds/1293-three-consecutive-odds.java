class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                res.add(i);
            }
        }
        for (int i = 0; i < res.size() - 2; i++) {
            if (res.get(i + 1) == res.get(i) + 1 &&
                res.get(i + 2) == res.get(i) + 2) {
                return true;
            }
        }

        return false;
    }
}
