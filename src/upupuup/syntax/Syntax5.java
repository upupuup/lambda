package upupuup.syntax;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:upupupuup
 * @Date:2019/8/4 9:08 AM
 * @Version 1.0
 * @Description:[一句话描述该类的功能]
 */
public class Syntax5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(16);
        list.add("1");
        list.add("2");
        list.add("3");

        list.stream().forEach(str -> System.out.println(str));
    }
}
