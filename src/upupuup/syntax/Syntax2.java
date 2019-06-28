package upupuup.syntax;

import upupuup.interfaces.LambdaNoneReturnMutipleParameter;
import upupuup.interfaces.LambdaNoneReturnSimpleParameter;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/6/28 16:49
 * @Version: 1.0
 * @Description: [java类作用描述]
 */
public class Syntax2 {
	public static void main(String[] args) {
		// 由于在接口的方法中已经定义了参数和返回类型
		LambdaNoneReturnMutipleParameter lambda1 = (a, b) -> System.out.println("lambda1~");

		LambdaNoneReturnSimpleParameter lambda2 = a -> System.out.println("lambda2:" + a);
	}
}
