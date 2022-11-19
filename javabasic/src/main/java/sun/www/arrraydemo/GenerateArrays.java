package main.java.sun.www.arrraydemo;

import java.util.Arrays;
import java.util.Random;

/**
 * @author zhangxiao
 * @date 2022-11-19 10:32:19
 * description: 随机生成一个int数组
 */

public class GenerateArrays {

    public static int[] generateOneArray() {

        //随机生成一个无序int数组
        Random random = new Random();
        int count =  random.nextInt(75)+25;
        System.out.println("数组长度是："+count);
        int[] nums = new int[count];
        for(int i=0;i<count;i++) {
            nums[i] = random.nextInt(100)+1;
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

}
