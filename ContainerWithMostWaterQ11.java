public class ContainerWithMostWaterQ11 {
    public static void main(String[] args) {
        int[] height = { 2, 3, 4, 5, 18, 17, 6 };
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        if (height.length == 0) {
            return 0;
        }
        int left = height.length / 2 - 2;
        int right = height.length / 2 + 1;
        int leftMax = height.length / 2 - 1;
        int rightMax = height.length / 2;

        while (left >= 0 || right < height.length) {

            // left
            if (left >= 0 && height[rightMax] >= height[left]) {
                if (height[left] + leftMax - left >= height[leftMax]) {
                    leftMax = left;
                }
            } else if (left >= 0 && height[rightMax] < height[left]) {
                if (height[left] + leftMax - left >= height[leftMax]) {
                    leftMax = left;
                }
                // if (height[left] - (height[left] - height[rightMax]) + leftMax - left >=
                // height[leftMax]) {
                // leftMax = left;
                // }
            }

            // for right
            if (right < height.length && height[leftMax] >= height[right]) {
                if (height[right] + right - rightMax >= height[rightMax]) {
                    rightMax = right;
                }
            } else if (right < height.length && height[leftMax] < height[right]) {
                if (height[right] + rightMax - right >= height[rightMax]) {
                    rightMax = right;
                }
            }
            left--;
            right++;
        }

        if (height[leftMax] > height[rightMax]) {
            return height[rightMax] * ((rightMax - leftMax));
        }

        return height[leftMax] * ((rightMax - leftMax));
    }

}