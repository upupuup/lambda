package upupuup.exercise;

import upupuup.data.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/**
 * @Author:upupupuup
 * @Date:2019/6/28 8:02 PM
 * @Version 1.0
 * @Description:[一句话描述该类的功能]
 */
public class Exercise3 {
    public static void main(String[] args) {
        // 集合遍历
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        // 将集合的每一个元素都带入到方法accept中
        list.forEach(System.out::println);
        System.out.println("-----");
        list.forEach(ele -> {
            if (ele % 2 == 0) {
                System.out.println(ele);
            }
        });
    }
}
