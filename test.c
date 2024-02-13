#include <stdio.h>

int removeElement(int* nums, int numsSize, int val) {
    int k = numsSize;

    for (int i = 0; i < k; i++) {
        if (nums[i] == val) {
            int temp = nums[i];
            int j = k;
            while (nums[j - 1] == val) {
                j--;
            }
            nums[i] = nums[j - 1];
            nums[j - 1] = temp;
            k--;
        }
    }

    return k;
}