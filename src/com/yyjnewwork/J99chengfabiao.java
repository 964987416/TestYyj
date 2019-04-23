package com.yyjnewwork;

/**
 * @author yyj
 * @version CreateTime：2018年8月24日 上午9:28:16
 * 输出四种形式的99乘法表
 * 
形式1：
1*1= 1
1*2= 2  2*2= 4
1*3= 3  2*3= 6  3*3= 9
1*4= 4  2*4= 8  3*4=12  4*4=16
1*5= 5  2*5=10  3*5=15  4*5=20  5*5=25
1*6= 6  2*6=12  3*6=18  4*6=24  5*6=30  6*6=36
1*7= 7  2*7=14  3*7=21  4*7=28  5*7=35  6*7=42  7*7=49
1*8= 8  2*8=16  3*8=24  4*8=32  5*8=40  6*8=48  7*8=56  8*8=64
1*9= 9  2*9=18  3*9=27  4*9=36  5*9=45  6*9=54  7*9=63  8*9=72  9*9=81

形式2：
1*9= 9  2*9=18  3*9=27  4*9=36  5*9=45  6*9=54  7*9=63  8*9=72  9*9=81
1*8= 8  2*8=16  3*8=24  4*8=32  5*8=40  6*8=48  7*8=56  8*8=64
1*7= 7  2*7=14  3*7=21  4*7=28  5*7=35  6*7=42  7*7=49
1*6= 6  2*6=12  3*6=18  4*6=24  5*6=30  6*6=36
1*5= 5  2*5=10  3*5=15  4*5=20  5*5=25
1*4= 4  2*4= 8  3*4=12  4*4=16
1*3= 3  2*3= 6  3*3= 9
1*2= 2  2*2= 4
1*1= 1

形式3：
                                                                1*1= 1
                                                        1*2= 2  2*2= 4
                                                1*3= 3  2*3= 6  3*3= 9
                                        1*4= 4  2*4= 8  3*4=12  4*4=16
                                1*5= 5  2*5=10  3*5=15  4*5=20  5*5=25
                        1*6= 6  2*6=12  3*6=18  4*6=24  5*6=30  6*6=36
                1*7= 7  2*7=14  3*7=21  4*7=28  5*7=35  6*7=42  7*7=49
        1*8= 8  2*8=16  3*8=24  4*8=32  5*8=40  6*8=48  7*8=56  8*8=64
1*9= 9  2*9=18  3*9=27  4*9=36  5*9=45  6*9=54  7*9=63  8*9=72  9*9=81

形式4：
1*9= 9  2*9=18  3*9=27  4*9=36  5*9=45  6*9=54  7*9=63  8*9=72  9*9=81
        1*8= 8  2*8=16  3*8=24  4*8=32  5*8=40  6*8=48  7*8=56  8*8=64
                1*7= 7  2*7=14  3*7=21  4*7=28  5*7=35  6*7=42  7*7=49
                        1*6= 6  2*6=12  3*6=18  4*6=24  5*6=30  6*6=36
                                1*5= 5  2*5=10  3*5=15  4*5=20  5*5=25
                                        1*4= 4  2*4= 8  3*4=12  4*4=16
                                                1*3= 3  2*3= 6  3*3= 9
                                                        1*2= 2  2*2= 4
                                                                1*1= 1
 * 
 */
public class J99chengfabiao {
	public void test1() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "x" + i + "=" + i * j + "\t");
			}
			System.out.println("");
		}

	}
	public void test2() {
		for (int i = 9; i >= 1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j + "x" + i + "=" + i * j + "\t");
			}
			System.out.println("");
		}

	}
	
	public void test3() {
		for (int i = 1; i <= 9; i++) {
			for(int k = 1;k<=9-i;k++){
				System.out.print("\t");
			}
			for (int j = 1; j <= i; j++) {
				
				System.out.print(j + "x" + i + "=" + i * j + "\t");
				
			}
			System.out.println("");
		}
	}
	public void test4() {
		for (int i = 9; i >= 1; i--) {
			for(int k =1;k<=9-i;k++){
				System.out.print("\t");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print(j + "x" + i + "=" + i * j + "\t");
			}
			System.out.println("");
		}

	}
	
	
	

	public static void main(String[] args) {
		J99chengfabiao j = new J99chengfabiao();
		System.out.println("");
		System.out.println("形式一:");
		System.out.println("");
		j.test1();
		System.out.println("");
		System.out.println("形式二:");
		System.out.println("");
		j.test2();
		System.out.println("");
		System.out.println("形式三:");
		System.out.println("");
		j.test3();
		System.out.println("");
		System.out.println("形式四:");
		System.out.println("");
		j.test4();
	}
}
