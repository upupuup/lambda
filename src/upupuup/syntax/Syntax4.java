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
	}
}

interface PersonCreater {
	Person getPerson();
}
