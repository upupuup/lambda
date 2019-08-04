package upupuup.fruit;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @Author:upupupuup
 * @Date:2019/8/4 9:16 AM
 * @Version 1.0
 * @Description:demo
 */
public class FruitDemo {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>(16);
        List<Apple> apples = new ArrayList<>(16);

        for (int i = 0; i < 10; i++) {
            Fruit fruit = new Fruit();
            fruit.setId(UUID.randomUUID().toString());
            fruit.setMark("aa" + i);
            for (int j = 0; j < 3; j++) {
                Apple apple = new Apple();
                apple.setId(UUID.randomUUID().toString());
                apple.setMark("aa" + i);
                apples.add(apple);
            }
            fruits.add(fruit);

        }

        // 赋值方式
        fruits.forEach(fruit -> fruit.setAppleList(
            apples.stream().filter(
                    apple -> apple.getMark().equals(fruit.getMark())
                ).collect(Collectors.toList()
            )
        ));

        fruits.forEach(
                fruit -> fruit.setAppleList(
                        apples.stream().filter(
                                apple -> apple.getMark().equals(fruit.getMark())
                        ).collect(Collectors.toList())
                )
        );

        System.out.println(fruits);
    }
}
