package upupuup.syntax;

import upupuup.interfaces.LambdaSimpleReturnSimpleParameter;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/6/28 16:55
 * @Version: 1.0
 * @Description: [java类作用描述]
 */
public class Syntax3 {
	public static void main(String[] args) {
		/*
		使用方法引用。可以快速的将一个Lambda表达式的直线指向一个已经实现的方法
		语法：方法的隶属者::方法名
		 */
		LambdaSimpleReturnSimpleParameter lambda1 = a -> change(a);
		int ret = lambda1.test(10);
		System.out.println(ret);

		LambdaSimpleReturnSimpleParameter lambda2 = Syntax3::change;
		ret = lambda2.test(10);
		System.out.println(ret);

		LambdaSimpleReturnSimpleParameter lambda3 = Syntax3::square;
		ret = lambda3.test(10);
		System.out.println(ret);
	}

	private static int change(int a) {
		return a * 2;
	}

	private static int square(int a) {
		return a * a;
	}
}
