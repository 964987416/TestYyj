package com.briup.oldTest;
/**
 * �����ȫ����
 * @author moose
 *
 */

public class ClassLoading extends SuperClass{
	static String name=getName();
	Integer age=getAge();
	
	static {
		System.out.println("���ྲ̬�����");
	}
	
	{
		System.out.println("�������������");
	}
	public ClassLoading() {
		// TODO Auto-generated constructor stub
		System.out.println("���๹����");
	}
	
	public static String getName() {
		System.out.println("���ྲ̬����");
		return "hsj";
	}
	public static Integer getAge() {
		System.out.println("�����Ա����");
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
		System.out.println("���ྲ̬�����");
	}
	{
		System.out.println("�������������");
	}
	public static String getSex() {
		System.out.println("���ྲ̬����");
		return "male";
	}
	public static Integer getHeigth() {
		System.out.println("�����Ա����");
		return 180;
	}
	public SuperClass() {
		// TODO Auto-generated constructor stub
		System.out.println("���๹����");
	}
}