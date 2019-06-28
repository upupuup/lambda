package upupuup.closure;

import java.util.function.Consumer;

/**
 * @Author:upupupuup
 * @Date:2019/6/28 11:30 PM
 * @Version 1.0
 * @Description:[一句话描述该类的功能]
 */
public class Closuredemo1 {
    public static void main(String[] args) {
        // 不能修改a
        int a = 10;
        Consumer<Integer> c = ele -> {
            // System.out.println(a); 这样就会报错，因为后面++了
            System.out.println(ele);
        };
        a++;

        c.accept(a);
    }


}
