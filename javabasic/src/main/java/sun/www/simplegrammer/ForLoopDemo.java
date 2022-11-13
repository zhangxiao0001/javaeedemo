package main.java.sun.www.simplegrammer;

/**
 * @author zhangxiao
 * @date 2022-11-13 09:26:16
 * description: for循环示例
 */


import org.junit.Test;

import java.util.Scanner;


public class ForLoopDemo {

    /**
     * 循环1到150，每行打印一个数，
     * 如果是3的倍数，在其后打印“foo”，
     * 如果是5的倍数，在其后打印“biz”,
     * 如果是6的倍数，在其后打印"baz"
     */
    @Test
    public void testForLoop1() {
        for(int i=1;i<151;i++) {
            System.out.print(i);
            if(i%3 == 0) {
                System.out.print(" foo");
            }
            if(i%5 == 0) {
                System.out.print(" biz");
            }
            if(i%7 == 0) {
                System.out.print(" baz");
            }
            System.out.println();
        }
    }

    /**
     * 打印1到100之间所有奇数的和
     */
    @Test
    public void testForLoop2() {

        int sum = 0;
        for(int i=1;i<=100;i++) {
            if(i%2!=0) {
                sum+=i;
            }
        }
        System.out.println("1到100之间所有奇数的和是："+sum);

    }

    /**
     * 打印1到100之间7的倍数的个数及总和，体会计数器
     */
    @Test
    public void testForLoop3() {

        int count = 0; // 7的倍数的个数
        int sum = 0; // 总和
        for(int i=1;i<=100;i++) {
            if(i%7==0) {
                count++;
                sum+=i;
            }
        }
        System.out.println("7的整数倍的数字一共有："+count+" 个");
        System.out.println("这些数的和是："+sum);
    }

    /**
     * 打印水仙花数，水仙花数指一个三位数，其各个位上数字立方和等于其本身
     * 例如 153=1*1*1+5*5*5+3*3*3
     */
    @Test
    public void testForLoop4() {

        for(int i=100;i<1000;i++) {
            int a = i/100; // 求百位上的数字
            int b = i%100/10; // 十位上的数字
            int c = i%10; // 个位上的数字
            if(i == (Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3))) {
                System.out.println(i);
            }

        }

    }


}
