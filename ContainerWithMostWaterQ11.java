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

    // public static int maxArea(int[] height) {
    // if (height.length < 3) {
    // if (height[0] > height[1]) {
    // return height[0];
    // }
    // return height[1];
    // }
    // int left = 1;
    // int right = height.length - 2;
    // int leftMax = 0;
    // int rightMax = height.length - 1;

    // while (left < height.length && right >= 0) {

    // // left
    // if (left >= 0) {
    // if (height[left] + left - leftMax >= height[leftMax]) {
    // leftMax = left;
    // }
    // }
    // // else if (left >= 0 && height[rightMax] < height[left]) {
    // // if (height[left] + leftMax - left >= height[leftMax]) {
    // // leftMax = left;
    // // }
    // // // if (height[left] - (height[left] - height[rightMax]) + leftMax - left
    // >=
    // // // height[leftMax]) {
    // // // leftMax = left;
    // // // }
    // // }

    // // for right
    // if (right < height.length) {
    // if (height[right] + rightMax - right >= height[rightMax]) {
    // rightMax = right;
    // }
    // }
    // // else if (right < height.length && height[leftMax] < height[right]) {
    // // if (height[right] + rightMax - right >= height[rightMax]) {
    // // rightMax = right;
    // // }
    // // }
    // left++;
    // right--;
    // }

    // int max = 0;
    // if (height[leftMax] > height[rightMax]) {
    // max = height[rightMax] * ((leftMax - rightMax));
    // } else {
    // max = height[leftMax] * (leftMax - rightMax);
    // }
    // if (max < height.length) {
    // return height.length;
    // }
    // return max;

    // }

}