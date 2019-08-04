### lambda表达式

***

- 在list设置一个值

  使用lambda前

  ```
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
  ```

  使用lambda后

  ```
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
  ```

  

-  

- 