package CyclicSort;

import java.util.List;
import java.util.ArrayList;

public class FindAllMissing {
    public static void main (String[] args) {
        int[] arr = { 4, 1, 0, 2 };
        List<Integer> ans = findDisappearedNumbers(arr);
        System.out.println(ans);
    }

    static List<Integer>findDisappearedNumbers (int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, nums[i], nums[correctIndex]);
            } else {
                i++;
            }
        }

        // find missing numbers
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    static void swap (int[] arr, int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
      
}
