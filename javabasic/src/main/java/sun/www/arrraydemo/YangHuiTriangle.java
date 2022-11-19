package main.java.sun.www.arrraydemo;

/**
 * @author zhangxiao
 * @date 2022-11-13 20:35:36
 * description: 杨辉三角，二维数组实现
 */

import org.junit.Test;

/**
 * 杨辉三角
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 * 1 6 15 20 15 6 1
 * 1 7 21 35 35 21 7 1
 * 1 8 28 56 70 56 28 8 1
 * 1 9 36 84 126 126 84 36 9 1
 */
public class YangHuiTriangle {

    /***
     * 实现杨辉三角前十行
     */
    @Test
    public void test1() {

        int[][] yangHuiTriangle = new int[10][];
        for (int i = 0; i < yangHuiTriangle.length; i++) {
            // 初始化二维数组每一行
            yangHuiTriangle[i] = new int[i + 1];
            // 行首元素赋值1
            yangHuiTriangle[i][0] = 1;
            // 行尾元素赋值1
            yangHuiTriangle[i][i] = 1;
            if (i > 1) {
                for (int j = 1; j < yangHuiTriangle[i].length - 1; j++) {
                    yangHuiTriangle[i][j] = yangHuiTriangle[i - 1][j - 1] + yangHuiTriangle[i - 1][j];
                }
            }
        }

        for (int i = 0; i < yangHuiTriangle.length; i++) {
            for (int j = 0; j < yangHuiTriangle[i].length; j++) {
                System.out.print(yangHuiTriangle[i][j]+" ");
            }
            System.out.println();
        }
        
    }

}
