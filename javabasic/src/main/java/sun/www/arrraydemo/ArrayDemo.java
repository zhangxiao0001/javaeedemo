package main.java.sun.www.arrraydemo;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author zhangxiao
 * @date 2022-11-14 21:19:10
 * description: 数组操作
 */

public class ArrayDemo {

    /**
     * 数组元素的反转
     */
    @Test
    public void test1() {

        String[] strs = new String[]{"AA","BB","CC","DD","EE"};
        // 循环一半，交换头尾元素来完成空间复杂度O(1)
        for(int i=0;i<strs.length/2;i++) {
            String tmp = strs[i];
            strs[i] = strs[strs.length-i-1];
            strs[strs.length-i-1] = tmp;
        }
        System.out.println(Arrays.toString(strs));
    }

}
