package upupuup.exercise;

import upupuup.data.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:upupupuup
 * @Date:2019/6/28 8:02 PM
 * @Version 1.0
 * @Description:在一个ArrayList里有若干个Person对象，将这些对象按照年龄进行排序
 */
public class Exercise1 {
    public static void main(String[] args) {
        // 在一个ArrayList里有若干个Person对象，将这些对象按照年龄进行排序
        List<Person> list = new ArrayList<>();
        list.add(new Person("小明", 10));
        list.add(new Person("小黑", 12));
        list.add(new Person("小帅", 14));
        list.add(new Person("小白", 9));
        list.add(new Person("小江", 11));
        list.add(new Person("小王", 12));

        list.sort((o1, o2) -> o2.getAge() - o1.getAge());
        System.out.println(list);

    }
}
