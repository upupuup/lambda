package upupuup.exercise;

import upupuup.data.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @Author:upupupuup
 * @Date:2019/6/28 8:02 PM
 * @Version 1.0
 * @Description:筛选大于10岁的小朋友
 */
public class Exercise4 {
    public static void main(String[] args) {
        // 删除集合中满足条件的元素
        List<Person> list = new ArrayList<>();
        list.add(new Person("小明", 10));
        list.add(new Person("小黑", 12));
        list.add(new Person("小帅", 14));
        list.add(new Person("小白", 9));
        list.add(new Person("小江", 11));
        list.add(new Person("小王", 12));

        // 原来的方法
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getAge() > 10) {
                return;
            }
        }

        // lambda方法
        list.add(new Person("小黑", 12));
        list.add(new Person("小帅", 14));
        list.add(new Person("小江", 11));
        list.add(new Person("小王", 12));
        list.removeIf(ele -> ele.getAge() > 10);
        System.out.println(list);
    }
}
