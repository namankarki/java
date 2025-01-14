import java.util.Arrays;

public class max_min {
    public static void main(String[] args) {
        
        int[] arr = {12, 3, 5, 7, 19, 3, 5, 12};

        if (arr.length < 2) {
            System.out.println("Array must contain at least two distinct elements.");
            return;
        }

        // Sort the array
        Arrays.sort(arr);

        // Find second minimum
        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num > min) {
                secondMin = num;
                break;
            }
        }

        // Find second maximum
        int max = arr[arr.length - 1];
        int secondMax = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < max) {
                secondMax = arr[i];
                break;
            }
        }

        if (secondMin == Integer.MAX_VALUE || secondMax == Integer.MIN_VALUE) {
            System.out.println("Array does not have two distinct elements.");
        } else {
            System.out.println("Second Minimum: " + secondMin);
            System.out.println("Second Maximum: " + secondMax);
        }

    }
}
