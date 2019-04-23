package com.briup.Test50Example;

/**
 * @author yyj
 * @version CreateTime：2018年10月30日 下午5:13:03
 *          一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
 * 
 *          1第一次 反弹 50 落地100m 
 *          2第二次 反弹25 落地 100+50+50 
 *          3第三次反弹 12.5 落地100+50+50+25+25 
 *          4第四次反弹 6.25 100+50+50+25+25 +12.5+12.5
 */
public class Tets10 {
	// 反弹多高
	public static double Function(int n, double m) {
		if (n == 1) {
			return m / 2;
		} else {
			for (int i = 1; i <= n; i++) {
				m = m / 2;
			}
		}

		return m;
	}

	public static double Function1(int n, double m) {
		double sum = 100;
		if (n == 1) {
			return m;
		} else {
			if (n >= 1) {
				sum = Function1(n - 1, m) + 2 * Function(n - 1, m);
			}
			return sum;
		}
	}

	public static void main(String[] args) {
		int n = 4;
		double m = 100.0;
		// 第n次反弹多高？
		System.out.println("第" + n + "次反弹高度为" + Function(n, m) + "m");
		// 总共跳动了多少距离
		System.out.println("第" + n + "次落地时小球共经过" + Function1(n, m) + "m");

	}

}
