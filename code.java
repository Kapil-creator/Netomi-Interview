// Move all zeros to left and all ones to right

import java.util.Arrays;

public class MoveZeroAndOnes {
    public static void main(String[] args) {
        char[] arr = {'0', '1', '1', '0', '0', '1', '0', '0'};
        moveZerosLeftAndRight(arr);
        System.out.println("Array after moving zeros: " + Arrays.toString(arr));
    }

    public static void moveZerosLeftAndRight(char[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            while (left < right && arr[left] == '0') {
                left++;
            }
            while (left < right && arr[right] == '1') {
                right--;
            }
            if (left < right) {
                arr[left] = '0';
                arr[right] = '1';
                left++;
                right--;
            }
        }
    }
}
