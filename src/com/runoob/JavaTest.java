package com.runoob;

/**
 * @author yyj
 * @version CreateTime：2019年1月14日 上午11:10:37
 * 构造方法
 * 
 */
public class JavaTest {
	// javaTest的构造方法 [Puppy love 少年初恋 不成熟]
	public JavaTest(String name) {
		// 构造方法中只有一个String类型的参数name
		System.out.println("我的类名是" + name);
	}

	final static int d =100;
	
	public static void main(String[] args) {
		// 在创建对象的时候就会调用该类的构造方法
		JavaTest t = new JavaTest("JavaTest");

		// int类型可以声明十进制 八进制 16进制
		int a = 666;// 10进制
		int b = 0101;// 八进制
		int c = 0x11;// 十六进制
		int e = 4+(3+2)*2;
		System.out.println("十进制：" + a);
		System.out.println("八进制：" + b);
		System.out.println("十六进制：" + c);

	}
}
