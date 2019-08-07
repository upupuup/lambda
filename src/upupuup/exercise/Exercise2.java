package upupuup.exercise;

import upupuup.data.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @Author:upupupuup
 * @Date:2019/6/28 8:02 PM
 * @Version 1.0
 * @Description:在一个Set里有若干个Person对象，将这些对象按照年龄进行排序，使用lambda表达式
 */
public class Exercise2 {
    public static void main(String[] args) {
        // 在一个ArrayList里有若干个Person对象，将这些对象按照年龄进行排序，使用lambda表达式
        TreeSet<Person> set = new TreeSet<>((o1, o2) -> {
            if (o1.getAge() > o2.getAge()) {
                return -1;
            }
            return 1;
        });
        set.add(new Person("小明", 10));
        set.add(new Person("小黑", 12));
        set.add(new Person("小帅", 14));
        set.add(new Person("小白", 9));
        set.add(new Person("小江", 11));
        set.add(new Person("小王", 12));

        System.out.println(set);
    }
}
