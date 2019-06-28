package upupuup.syntax;

import upupuup.data.Person;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/6/28 17:21
 * @Version: 1.0
 * @Description: [java类作用描述]
 */
public class Syntax4 {
	public static void main(String[] args) {
		PersonCreater personCreater = () -> new Person();

		// 构造方法的引用
		PersonCreater personCreater1 = Person::new;
		personCreater1.getPerson();

		PersonCreate2 personCreater2 = Person::new;
		personCreater2.getPerson("小明", 10);
	}
}

/**
 * 借口一
 */
interface PersonCreater {
	Person getPerson();
}

/**
 * 接口二
 */
interface PersonCreate2 {
	Person getPerson(String name, int age);
}
