package main.java.sun.www.arrraydemo;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * @author zhangxiao
 * @date 2022-11-16 19:51:00
 * description: 二分法
 */

public class DichotomyDemo {

    @Test
    public void test() {

        //随机生成一个数字数组，然后排序
        int[] nums = GenerateArrays.generateOneArray();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        Random random = new Random();
        // 设置目标数字
        int target = random.nextInt(100)+1;

        int low = 0;
        int high = nums.length-1;
        // 标志位，目标数字是否存在
        boolean isExists = false;
        while(low <= high) {
            int middle = (low+high)/2;
            if(target == nums[middle]) {
                System.out.println("已经找到:"+target+",目标下标是:"+middle);
                isExists = true;
                break;
            } else if(target < nums[middle]) {
                high = middle-1;
            } else {
                low = middle+1;
            }
        }
        if(!isExists) {
            System.out.println("在该数组中没找到:"+target);
        }

    }

}
