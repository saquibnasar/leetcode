public class ContainerWithMostWaterQ11 {
    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            if (height[left] < height[right]) {
                if (max < height[left] * (right - left)) {
                    max = height[left] * (right - left);
                }
                left++;
            } else {
                if (max < height[right] * (right - left)) {
                    max = height[right] * (right - left);
                }
                right--;
            }
        }
        return max;
    }

}