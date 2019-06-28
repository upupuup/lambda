package upupuup.exercise;

/**
 * @Author:upupupuup
 * @Date:2019/6/28 10:54 PM
 * @Version 1.0
 * @Description:[一句话描述该类的功能]
 */
public class Exercise5 {
    public static void main(String[] args) {
        // 开辟一条线程，输出数字
        Thread t = new Thread(() -> {
            for(int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
        t.start();
    }
}
