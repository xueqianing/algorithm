package dynamic_programming;

/**
 * 斐波那契数列（Fibonacci sequence），又称黄金分割数列、因数学家莱昂纳多·斐波那契（Leonardoda Fibonacci）以兔子繁殖为例子而引入，故又称为“兔子数列”，指的是这样一个数列：
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, …
 * 它的规律是：当前数字，是之前两个数字之和。
 * 在数学上，斐波那契数列以如下被以递推的方法定义：
 * F(0)=0，F(1)=1, F(n) = F(n - 1) + F(n - 2)（n ≥ 2，n ∈ N*）
 */
public class FibonacciSequence {
    public static int fib(int n){
        /**
         * ji zhui
         */
        if(n == 1 || n==2){
            return 1;
        }

        return fib(n-1) + fib(n-2);

    }

    public static int fib2(int n){
        final int[] ints = new int[n];
        ints[0] = ints[1] = 1;
        for (int i = 2; i < n; i++) {
            ints[i] = ints[i-1] + ints[i-2];
        }
        return ints[n-1];

    }


    public static void main(String[] args) {
        final int fib = fib2(9);
        System.out.println(fib);

    }
}
