package com.briup.Test.stream; 

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/** 
 * @author yyj 
 * @version CreateTime：2018年1月10日 上午10:01:12 
 * 
 */
public class ByteArrayInOutputStreamTest {

	public static void main(String[] args) throws Exception {
		ByteArrayInputStream bais = null;
		ByteArrayOutputStream baos = null;
		String str = "helloworld";
		byte [] buf = str.getBytes();
		bais = new ByteArrayInputStream(buf);
		baos = new ByteArrayOutputStream();
		int i =0;
		bais.skip(2);
		while((i = bais.read())!=-1){
			System.out.println(i);
			baos.write(i);
		}
		baos.flush();
		System.out.println(baos.toString());
		if(bais!=null)
			bais.close();
		if(baos!=null)
			baos.close();
		
	}
}
 