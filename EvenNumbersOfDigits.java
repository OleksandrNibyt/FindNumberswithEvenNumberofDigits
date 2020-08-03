class Solution {
    public static int findNumbers(int[] nums) {
        int result = 0;
        for (int i: nums){
            if (String.valueOf(i).length()%2 ==0){
                result++;
            }
        }
        return result;
    }
}

public class EvenNumbersOfDigits {
    public static void main(String[] args) {
        int[] input = {12,345,2,6,7896};
        int result = Solution.findNumbers(input);
        System.out.println(String.valueOf(result));
    }

}
