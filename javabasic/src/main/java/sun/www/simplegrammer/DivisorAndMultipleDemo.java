package main.java.sun.www.simplegrammer;

import java.util.Scanner;

/**
 * @author zhangxiao
 * @date 2022-11-13 10:12:21
 * description:求最大公约数和最小公倍数
 */


/**
 * 求两个正整数的最大公约数和最小公倍数
 *  12和20最大公约数是4，最小公倍数是60
 *  利用Scanner获取控制台的输入，main方法可以，@test注解不行
 */
public class DivisorAndMultipleDemo {

    public static void main(String[] args) {

        // 从控制台输入两个正整数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个正整数：");
        int m =scanner.nextInt();
        System.out.println("请输入第二个正整数：");
        int n =scanner.nextInt();

        // 将小值赋给m，大值赋给n
        if(m > n) {
            int tmp = m;
            m = n;
            n = tmp;
        }

        /**
         * 最大公约数，默认是1
         */
        int greatestCommonDivisor = 1;
        for(int i=m;i>0;i--) {
            if(m%i==0 && n%i==0) {
                greatestCommonDivisor = i;
                System.out.println(m+"和"+n+"的最大公约数是:"+greatestCommonDivisor);
                break;
            }
        }

        /**
         * 最小公倍数，默认是n
         */
        int leastCommonMultiple = n;
        for(int i=n;i<=n*m;i++) {
            if(i%m==0 && i%n==0) {
                leastCommonMultiple = i;
                System.out.println(m+"和"+n+"的最小公倍数是:"+leastCommonMultiple);
                break;
            }
        }

    }

}
