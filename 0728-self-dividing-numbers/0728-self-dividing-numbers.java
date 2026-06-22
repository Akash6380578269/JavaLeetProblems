class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        while (left <= right) {
            int num = left;
            boolean x = true;
            while (num > 0) {
                int d = num % 10;
                num /= 10;
                if (d == 0 || left % d != 0) {
                    x = false;
                    break;
                }
            }
            if (x) {
                list.add(left);
            }
            left++;
        }
        return list;

    }
}