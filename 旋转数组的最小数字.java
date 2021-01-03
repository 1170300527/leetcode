class Solution {
    public int minArray(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i+1]) {
                min = numbers[i+1];
                break;
            }
        }
        return min;
    }
}