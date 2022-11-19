package main.java.sun.www.arrraydemo;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.Arrays;

/**
 * @author zhangxiao
 * @date 2022-11-19 10:34:57
 * description: 数组排序
 */

public class ArraySortDemo {

    /**
     * 冒泡排序
     */
    @Test
    public void testBubbleSort() {

        int[] nums = GenerateArrays.generateOneArray();
        for(int i=0;i<nums.length-1;i++) {
            for(int j=0;j<nums.length-i-1;j++) {
                if(nums[j] > nums[j+1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }

    /**
     * 选择排序
     */
    @Test
    public void testSelectSort() {

        int[] nums = GenerateArrays.generateOneArray();
        for(int i=0;i<nums.length-1;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i] > nums[j]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
