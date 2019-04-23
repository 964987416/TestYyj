package com.briup;

/**
 * @author yyj
 * @version CreateTime：2018年2月8日 下午3:40:15
 * 
 */
public class Oldfan {
	public static void main(String[] args) {
		/**
		 * 安慰奖20个 三等奖10个 二等奖5个 一等奖2个 终极大奖1个
		 * 
		 */
		int count = 0;
		/**
		 * 安慰奖
		 */
		System.out.println("现在抽出20名安慰奖！");
		for (int i = 1; i <= 20; i++) {
			long a = Math.round(200 * Math.random());
			System.out.println("第" + i + "次安慰奖号码为" + a + "号");
			if (a == 147) {
				System.out.println("恭喜老范在第" + i + "次抽奖中抽中安慰奖，牛逼啊马飞！");
				count++;
			}
		}
		System.out.println("");
		System.out.println("现在抽出10名三等奖！");

		/**
		 * 三等奖
		 */
		for (int i = 1; i <= 10; i++) {
			long a = Math.round(200 * Math.random());
			System.out.println("第" + i + "次三等奖号码为" + a + "号");
			if (a == 147) {
				System.out.println("恭喜老范在第" + i + "次抽奖中抽中三等奖，牛逼啊马飞！");
				count++;
			}
		}
		System.out.println("");
		System.out.println("现在抽出5名二等奖！");

		/**
		 * 二等奖
		 */
		for (int i = 1; i <= 5; i++) {
			long a = Math.round(200 * Math.random());
			System.out.println("第" + i + "次二等奖号码为" + a + "号");
			if (a == 147) {
				System.out.println("恭喜老范在第" + i + "次抽奖中抽中二等奖，牛逼啊马飞！");
				count++;
			}
		}
		System.out.println("");
		System.out.println("现在抽出2名一等奖！");

		/**
		 * 一等奖
		 */
		for (int i = 1; i <= 2; i++) {
			long a = Math.round(200 * Math.random());
			System.out.println("第" + i + "次一等奖号码为" + a + "号");
			if (a == 147) {
				System.out.println("恭喜老范在第" + i + "次抽奖中抽中一等奖，牛逼啊马飞！");
				count++;
			}
		}
		System.out.println("");
		System.out.println("现在抽出1名终极大奖！");
		/**
		 * 终极大奖
		 */
		for (int i = 1; i <= 1; i++) {
			long a = Math.round(200 * Math.random());
			System.out.println("第" + i + "次终极大奖号码为" + a + "号");
			if (a == 147) {
				System.out.println("恭喜老范在第" + i + "次抽奖中抽中终极大奖，牛逼啊马飞！");
				count++;
			}
		}
		System.out.println("");
		if (count == 0) {
			System.out.println("难受。老范没中奖。。。");
		}else{
			System.out.println("老范中奖了！！");
		}

	}

}
