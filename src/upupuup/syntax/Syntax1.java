package upupuup.syntax;

import upupuup.interfaces.*;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/6/28 16:20
 * @Version: 1.0
 * @Description: [java类作用描述]
 */
public class Syntax1 {
	public static void main(String[] args) {
		// 参数列表、方法体。()：描述参数列表、{}：描述方法体、->：Lambda:读作goes to
		LambdaNoneReturnNoneParameter lambda1 = () -> System.out.println("lambda1:100");
		lambda1.test();

		LambdaNoneReturnSimpleParameter lambda2 = (int a) -> System.out.println("lambda2:" + a);
		lambda2.test(10);

		LambdaNoneReturnMutipleParameter lambda3 = (int a, int b) -> System.out.println("lambda2:" + (a + b));
		lambda3.test(10, 20);

		LambdaSimpleReturnNoneParameter lambda4 = () -> {
			System.out.print("lambda4:");
			return 100;
		};

		int ret = lambda4.test();
		System.out.println(ret);

		LambdaSimpleReturnSimpleParameter lambda5 = (a) -> {
			System.out.print("lambda5:");
			return a * 2;
		};
		ret = lambda5.test(10);
		System.out.println(ret);

		LambdaSingleReturnMutipleParameter lambda6 = (a, b) -> {
			System.out.print("lambda6:");
			return a + b;
		};
		ret = lambda6.test(10, 20);
		System.out.println(ret);
	}
}
