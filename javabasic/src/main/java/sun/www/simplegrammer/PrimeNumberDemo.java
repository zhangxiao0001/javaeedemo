package main.java.sun.www.simplegrammer;

/**
 * @author zhangxiao
 * @date 2022-11-13 19:53:53
 * description: 质数
 */

import org.junit.Test;

/**
 * 求100以内的质数
 */
public class PrimeNumberDemo {

    /**
     * 基础版
     */
    @Test
    public void test1() {
        outer:
        for(int i=2;i<=100;i++) {
            for(int j=2;j<=Math.sqrt(i);j++) {
                if(i%j ==0 ) {
                    continue outer;
                }
            }
            System.out.println(i);
        }
    }

}
