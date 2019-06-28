package upupuup.data;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/6/28 17:04
 * @Version: 1.0
 * @Description: [java类作用描述]
 */
public class Person {
	private String name;
	private int age;

	public Person() {
		System.out.println("Person的构造方法执行了");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person的有参构造方法执行了");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
