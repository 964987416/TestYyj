package com.briup.oldTest;
/**
 * 类加载全过程
 * @author moose
 *
 */

public class ClassLoading extends SuperClass{
	static String name=getName();
	Integer age=getAge();
	
	static {
		System.out.println("子类静态代码快");
	}
	
	{
		System.out.println("子类匿名代码快");
	}
	public ClassLoading() {
		// TODO Auto-generated constructor stub
		System.out.println("子类构造器");
	}
	
	public static String getName() {
		System.out.println("子类静态属性");
		return "hsj";
	}
	public static Integer getAge() {
		System.out.println("子类成员属性");
		return 20;
	}
	public static void main(String[] args) {
		new ClassLoading();
	}
}
class SuperClass {
	static String sex=getSex();
	Integer heigth=getHeigth();
	
	static {
		System.out.println("父类静态代码快");
	}
	{
		System.out.println("父类匿名代码快");
	}
	public static String getSex() {
		System.out.println("父类静态属性");
		return "male";
	}
	public static Integer getHeigth() {
		System.out.println("父类成员属性");
		return 180;
	}
	public SuperClass() {
		// TODO Auto-generated constructor stub
		System.out.println("父类构造器");
	}
}