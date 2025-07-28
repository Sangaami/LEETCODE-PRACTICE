class Solution {
    public int[] rearrangeArray(int[] a) {
          int n =a.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (a[i] >= 0) pos.add(a[i]);
            else neg.add(a[i]);
        }

        int[] result = new int[n];
        int i = 0, j = 0, k = 0;

        while (i < pos.size() && j < neg.size()) {
            result[k++] = pos.get(i++);
            result[k++] = neg.get(j++);
        }
        while (i < pos.size()) {
            result[k++] = pos.get(i++);
        }
        while (j < neg.size()) {
            result[k++] = neg.get(j++);
        }
 return result;
    }
}