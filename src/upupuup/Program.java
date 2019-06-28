package upupuup;

/**
 * @Author: jiangzhihong
 * @CreateDate: 2019/6/28 16:03
 * @Version: 1.0
 * @Description: [java类作用描述]
 */
public class Program {
	public static void main(String[] args) {
		// 使用接口
		Comparetor comparetor = new MyComparetor();

		// 使用匿名内部类
		Comparetor comparetor1 = new Comparetor() {
			@Override
			public int compare(int a, int b) {
				return a - b;
			}
		};

		// 使用Lambda表达式
		Comparetor comparetor2 = (a, b) -> a - b;
	}
}

class MyComparetor implements Comparetor {
	@Override
	public int compare(int a, int b) {
		return 0;
	}
}

interface Comparetor {
	int compare(int a, int b);
}
