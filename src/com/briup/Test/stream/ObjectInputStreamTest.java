package com.briup.Test.stream; 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/** 
 * @author yyj 
 * @version CreateTime：2018年1月17日 上午10:03:42 
 * 
 */
public class ObjectInputStreamTest {
	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\test.txt")); 
		
		
	}
}
 