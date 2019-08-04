package upupuup.fruit;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @Author:upupupuup
 * @Date:2019/8/4 9:16 AM
 * @Version 1.0
 * @Description:list设置
 */
public class FruitDemo {
    public static void main(String[] args) {
        // 新建一个水果list
        List<Fruit> fruits = new ArrayList<>(16);
        // 新建一个苹果list
        List<Apple> apples = new ArrayList<>(16);

        int fruitNum = 10;
        int appleNum = 3;

        // 设置水果list和苹果list
        for (int i = 0; i < fruitNum; i++) {
            Fruit fruit = new Fruit();
            fruit.setId(UUID.randomUUID().toString());
            fruit.setMark("aa" + i);

            fruits.add(fruit);

        }

        // 赋值方式
        fruits.forEach(fruit -> fruit.setAppleList(
            apples.stream().filter(
                    apple -> apple.getMark().equals(fruit.getMark())
                ).collect(Collectors.toList()
            )
        ));

        // 循环水果list
        fruits.forEach(
                // 获取水果实体类,设置苹果list
                fruit -> fruit.setAppleList(
                        // 过滤删选条件并赋值
                        apples.stream().filter(
                                apple -> apple.getMark().equals(fruit.getMark())
                        ).collect(Collectors.toList())
                )
        );

        // 循环水果类
        for (Fruit fruitItem : fruits) {
            for (Apple appleItem : apples) {
                String mark = appleItem.getMark();
                // 判断mark是否一致，一致则塞值
                if (appleItem.getMark().equals(fruitItem.getMark())) {
                    List<Apple> appleList = fruitItem.getAppleList();
                    appleList.add(appleItem);
                    fruitItem.setAppleList(appleList);
                }
            }
        }

        System.out.println(fruits);

        apples.clear();

        settingApple(appleNum, apples);

        fruits.stream().map(
                fruit -> apples.stream().filter(
                        apple -> apple.getMark().equals(fruit.getMark())
                ).map(
                        apple -> {
                            fruit.setSpace(apple.getId());
                            return fruit;
                        }
                )
        ).collect(Collectors.toList());
        System.out.println(fruits);
    }

    private static void settingApple(int appleNum, List<Apple> apples) {
        for (int i = 0; i < appleNum; i++) {
            Apple apple = new Apple();
            apple.setId(UUID.randomUUID().toString());
            apple.setMark("aa" + i);
            apples.add(apple);
        }
    }
}
