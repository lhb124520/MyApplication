package com.example.liuhb.myapplication;

public class Queen_test {
    int max = 8;
    /**
     * 该数组保存结果，第一个皇后摆在array[0]列，第二个摆在array[1]列
     */
    int[] array = new int[max];

    public static void main(String[] args) {
        Queen_test q = new Queen_test();
        q.check(0);
    }

    /*n代表当前是第几个皇后 皇后n在array[n]列       */
    public void check(int n) {
        //结束条件是最后一行已经摆完
        if (n == max) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + 1 + " ");
            }

            System.out.println();
            return;
        }

        //从第一列开始放值，然后判断是否和行列斜线有冲突，如果OK，就进入下一行的逻辑
            /*array[0]=1;*/
        int count = 0;
        for (int i = 0; i < max; i++) {//从第i列开始放皇后，第一列放皇后，然后第二行放皇后
            array[n] = i;
            if (test(n)) {
                count++;
                check(n + 1);
            }
        }
    }

    public boolean test(int n) {
        for (int i = 0; i < n; i++) {
            if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }
}


