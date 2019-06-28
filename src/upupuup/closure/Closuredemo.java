package upupuup.closure;

import java.util.function.Supplier;

/**
 * @Author:upupupuup
 * @Date:2019/6/28 11:30 PM
 * @Version 1.0
 * @Description:[一句话描述该类的功能]
 */
public class Closuredemo {
    public static void main(String[] args) {
        int n = getNumber().get();
        System.out.println(n);
    }

    private static Supplier<Integer> getNumber() {
        int num = 10;
        return () -> num;
    }
}
