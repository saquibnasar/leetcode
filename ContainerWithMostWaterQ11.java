public class ContainerWithMostWaterQ11 {
    public static void main(String[] args) {
        int[] height = { 2, 3, 4, 5, 18, 17, 6 };
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        if (height.length == 0) {
            return 0;
        }
        int left = 1;
        int right = height.length - 2;
        int leftMax = 0;
        int rightMax = height.length - 1;

        while (left < height.length && right >= 0) {

            // for right
            if (height[leftMax] >= height[right]) {
                if (height[right] > height[rightMax] + (rightMax - right)) {
                    rightMax = right;
                }
            } else if (height[leftMax] < height[right]) {
                if (height[leftMax] > height[rightMax] + (rightMax - right)) {
                    rightMax = right;
                }
            }
            // left
            if (height[rightMax] >= height[left]) {
                if (height[left] >= height[leftMax] + (left - leftMax - 1)) {
                    leftMax = left;
                }
            } else if (height[leftMax] < height[right]) {
                if (height[rightMax] > height[leftMax] + (left - leftMax - 1)) {
                    leftMax = left;
                }
            }
            left++;
            right--;
        }

        if (height[leftMax] > height[rightMax]) {
            return height[rightMax] * ((rightMax - leftMax));
        }

        return height[leftMax] * ((rightMax - leftMax));
    }

}