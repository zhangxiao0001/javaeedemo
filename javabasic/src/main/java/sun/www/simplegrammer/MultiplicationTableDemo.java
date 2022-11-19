package main.java.sun.www.simplegrammer;

/**
 * @author zhangxiao
 * @date 2022-11-13 19:39:14
 * description: 九九乘法表，双层循环
 */

/*
 * 九九乘法表
 * 1*1=1
 * 1*2=2 2*2=4
 * 13*=3 2*3=6 3*3=9
 * 。。。。。。
 * 1*9=9。。。。。。9*9=81
 */
public class MultiplicationTableDemo {

    public static void main(String[] args) {
        for(int i=1;i<=9;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }

}
